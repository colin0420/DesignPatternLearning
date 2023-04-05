package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler;

        AbstractUserDao userDao = new UserDao();
        handler = new DaoLogHandler(userDao);

        // 动态代理创建，这里才是关键
        AbstractUserDao userDaoProxy = (AbstractUserDao)Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),
            new Class[] {AbstractUserDao.class}, handler);
        userDaoProxy.findUserById("001");
        userDaoProxy.findUserByName("张无忌");

        AbstractDocumentDao documentDao = new DocumentDao();
        handler = new DaoLogHandler(documentDao);
        AbstractDocumentDao documentDaoProxy =
            (AbstractDocumentDao)Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(),
                new Class[] {AbstractDocumentDao.class}, handler);
        documentDaoProxy.deleteDocumentById("D001");
    }
}
