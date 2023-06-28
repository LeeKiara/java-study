package singletone;

public class Test2 {

    public void test() {
        Operator s2 = Operator.getInstance();
        System.out.println(s2);

        int[] arr = {1,2,3};
        System.out.println(s2.multiply(arr));
    }
}
