package singletone;

// 싱글톤(Singleton)은 단일 인스턴스로 제한된 객체를 생성하기 위한 디자인 패턴
// 목적 : 클래스의 인스턴스가 하나만 존재하도록 하기 위함
// 객체 생성은 getInstance 메서드 호출 시 한번만
public class Operator {
    private static Operator instance;

    // private 접근 제한자를 생성자 앞에 붙임 > 외부에서 new 연산자로 생성자를 호출할 수 없도록 막기
    private Operator() {

    }

    // getInstance 메서드로 처음에 생성한 객체만 접근하게 하는 방법
    // 객체 생성은 getInstance 메서드 호출 시 한번만
    public static Operator getInstance() {
        if(instance == null) {
            instance = new Operator();

            System.out.println("객체가 처음 만들어집니다.");
        } else {
            System.out.println("객체가 이미 있기 때문에 존재하는 인스턴스를 리턴합니다.");
        }
        return instance;
    }

    public int multiply(int[] nums) {

        System.out.println("int[] 받고 곱하기");

        if(nums == null || nums.length < 0) {
            return 0;
        }

        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }
}
