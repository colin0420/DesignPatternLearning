package main.java.proxy;

public interface AbstractUserDao {
    boolean findUserById(String userId);

    boolean findUserByName(String name);
}
