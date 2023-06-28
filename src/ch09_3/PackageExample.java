package ch09_3;

public class PackageExample {
    public static void main(String[] args) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        // 컨텍스트 클래스로더를 사용하여 클래스 로딩
        try {
            Class<?> myClass = classLoader.loadClass("ch09_3.Main");
            System.out.println("Class loaded: " + myClass.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}




