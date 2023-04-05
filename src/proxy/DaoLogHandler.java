package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 */
public class DaoLogHandler implements InvocationHandler {
    private final Object realyObject;

    /**
     * 用于注入一个需要代理的真实主题对象
     * 
     * @param object 真实主题对象
     */
    public DaoLogHandler(Object object) {
        this.realyObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        // 这一步很关键，通过反射，调用真实对象方法
        Object result = method.invoke(realyObject, args);
        afterInvoke();
        return result;
    }

    public void beforeInvoke() {
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间:" + time);
    }

    public void afterInvoke() {
        System.out.println("调用方法结束!");
    }
}
