package ch01;

public class Excercise6 {
    public static void main(String[] args) {

        int price = 187000;

        int oman = price / 50000;
        System.out.println("5만원권 : "+ oman+"장");

        // 만원권 : price % 50000 / 10000;
        int price2 = price - (50000 * oman);
        int ilman = price2 / 10000;
        System.out.println("1만원권 : "+ ilman+"장");

        // 오천원권
        int price3 = price2 - (10000 * ilman);
        int ochun = price3 / 5000;
        System.out.println("5천원권 : "+ochun+"장");

        // 천원권
        int price4 = price3 - (5000 * ochun);
        int ilchun = price4 / 1000;
        System.out.println("1천원권 : "+ilchun+"장");

        System.out.println(price / 50000);
        System.out.println(price % 50000 / 10000);
        System.out.println(price % 10000 / 5000);
        System.out.println(price % 5000 / 1000);

    }
}
