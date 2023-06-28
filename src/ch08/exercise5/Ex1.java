package ch08.exercise5;

public class Ex1 {
    public static void main(String[] args) {
        ChildEx childEx = new ChildEx();
    }
}

class ParentEx {

    ParentEx() {
        this (1);
        System.out.println("(1).ParentEx()");
    }

    ParentEx(int x) {
        System.out.println("(2).ParentEx(int x)");
    }
}

class ChildEx extends ParentEx {
    ChildEx() {
        this(1);
        System.out.println("(3).ChildEx()");
    }

    ChildEx(int x) {
        System.out.println("(4).ChildEx(int x)");
    }
}
