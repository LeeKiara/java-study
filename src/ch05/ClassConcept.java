package ch05;

public class ClassConcept {
    public static void main(String[] args) {
        // 클래스(class)는 객체 지향 프로그래밍(Object Oriented Programming, OOP)의 핵심 개념 중 하나입니다.
        // - 객체를 생성하기 위한 템플릿 또는 청사진이라고 할 수 있습니다.
        // - 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성됩니다.

        // 클래스
        // 구조화된 데이터 구조를 생성하기 위한 틀(템플릿, template)
        // 같은 역할을 수행하는 코드를 찍어서 사용하기 위함(재사용)
        // OOP(Object Oriented Programming)
        // OOP -> CBD(component based design) -> SOA(service oriented architecture)
        // design : 코드 수준의 설계
        // OOP, 공학적인 방법론들은 규모확장과 관련이 있다.
        // 단점: boiler-plate의 증가(코드를 시작하기 위한 기본 뼈대)

        // 1 번째 주문 정보 객체 생성
        OrderInfo order1 = new OrderInfo("OR0001", "John Doe", "Product A", 49.99, 10);
        order1.displayOrderDetails();

        System.out.println();

        // 변수
        // 자료형 변수형
        // 클래스 : 개발자가 만들어낸 자료형

        // 객체를 생성
        // 클래스명 객체명 = new 클래스명(...)

        // 2 번째 주문 정보 객체 생성
        OrderInfo order2 = new OrderInfo("OR0002", "Jane Smith", "Product B", 99.99, 3);
        order2.displayOrderDetails();

        System.out.println();

        // 빈생성자는 코딩을 안해도 기본적으로 만들어짐
        // 생성잘르 별도로 만들면 기본적으로 있는건 사라짐
        OrderInfo order3 = new OrderInfo();
        // Java에서는 다른 클래스 필드를 직접 접근하지 않음
        // 예) order3.orderId = "or001";
        // Java에서는 다른 클래스에서 필드를 직접 접근할 때는 메서드로만 접근한다.
        order3.setOrderId("OR0003");
        order3.displayOrderDetails();

        System.out.println("order3.getOrderId() 시용하여 찍어보기");
        // 메서드 실행(호출, call)
        // 객체명.메서드명(...)
        // 메서드 블럭안의 코드가 실행됨
        System.out.println(order3.getOrderId());

        System.out.println();




    }
}
