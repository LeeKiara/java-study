package ch12;

public class Main {
    public static void main(String[] args) {
        MyService srv1 = new MyService("수강 관리 서비스");
        MyService srv2  = new MyService("----------> 학생 정보 관리 서비스");

        srv1.start();
        srv2.start();
    }
}
