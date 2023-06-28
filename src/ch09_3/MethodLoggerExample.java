package ch09_3;


import java.lang.reflect.Method;

/*
* 모든 클래스의 메서드를 읽어서 자동으로 로깅하는 기능
* */
public class MethodLoggerExample {

    public static void main(String[] args) {

//        Package pkgage = MethodLoggerExample.class.getPackage();
//        String packageName = pkgage.getName();
//
//        System.out.println("Package name: " + packageName);
//
//        String basePackage = "ch09_3";
//
//        Package[] packages = Package.getPackages();
//
//        for (Package pkg : packages) {
//            String packageNames = pkg.getName();
//            System.out.println("Package name: " + packageName);
//        }

        // 클래스 로딩
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        // 컨텍스트 클래스로더를 사용하여 클래스 로딩
        try {
            Class<?> myClass = classLoader.loadClass("ch09_3.ExampleClass");
            System.out.println("Class loaded: " + myClass.getName());
            logMethods(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }

        try {

//            Package pkg = Package.getPackages();
//
//            for (Class<?> cls : pkg.getClasses()) {
//                logMethods(cls);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 컬렉션, 상속, 인터페이스
    }

    private static void logMethods(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Logger.class)) {
                logMethodExecution(cls.getName(), method.getName());
            }
        }
    }

    private static void logMethodExecution(String className, String methodName) {
        System.out.println("Executing method: " + className + "." + methodName);
    }

}

class ExampleClass {
    @Logger
    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Logger
    public void doSomethingElse() {
        System.out.println("Doing something else...");
    }
}