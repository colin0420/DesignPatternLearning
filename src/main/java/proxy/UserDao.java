package main.java.proxy;

public class UserDao implements AbstractUserDao {
    @Override
    public boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("001")) {
            System.out.println("查询ID为" + userId + "的用户信息成功");
            return true;
        }
        System.out.println("查询ID为" + userId + "的用户信息失败");
        return false;
    }

    @Override
    public boolean findUserByName(String name) {
        if (name.equalsIgnoreCase("张无忌")) {
            System.out.println("查询名称为" + name + "的用户信息成功");
            return true;
        }
        System.out.println("查询名称为" + name + "的用户信息失败");
        return false;
    }
}
