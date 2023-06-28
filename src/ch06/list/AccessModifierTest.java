package ch06.list;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private int age;

    public User() {
        System.out.println("User class 생성");
    }

    public User(String name, int age) {
        System.out.println("User class 생성");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
class TempService {

    List<User> userList;

    public TempService() {
        System.out.println("TempService class 생성");
        userList = new ArrayList<User>();
    }

    public void joinUser(String name, int age) {
        userList.add(new User(name, age));
    }

    public List<User> getUser() {
        return this.userList;
    }

    public void printUser() {
        for (User tmpUser : userList) {
            System.out.println("NAME:"+tmpUser.getName() + ", AGE:"+tmpUser.getAge());
        }

    }
}

public class AccessModifierTest {
    public static void main(String[] args) {

        TempService tempService = new TempService();
        tempService.joinUser("Roa", 30);
        tempService.joinUser("Kacey", 25);

        tempService.printUser();

    }
}
