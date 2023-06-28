package singletone;

public class Main {
    public static void main(String[] args) {

        // 생성자가 private 접근제한자 라서 사용할수 없음
//        Singleton s1 = new Singleton();

        // static으로 쓸 때와 다른점은
        // 우리가 필요한 시점에 생성할 수 있음
//        Singleton s1 = Singleton.getInstance(); // 이때 객체 생성
//        Singleton s2 = Singleton.getInstance(); // 이전 생성된 것을 반환
//        Singleton s3 = Singleton.getInstance(); // 이전 생성된 것을 반환
//
//        System.out.println(s1); // singletone.Singleton@682a0b20
//        System.out.println(s2); // singletone.Singleton@682a0b20
//        System.out.println(s3); // singletone.Singleton@682a0b20
//
//        int[] arr = {1,2,3};
//        s1.multiply(arr);

        // 여기서도 싱글턴 쓰고 있음
        Test1 t1 = new Test1();
        t1.test();

        // 여기서도 싱글턴 쓰고 있는데....
        Test2 t2 = new Test2();
        t2.test();

        // 객체는 1회만 생성되었음

    }
}
