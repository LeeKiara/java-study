package ch08.exercise6;

public class Ex1 {
    public static void main(String[] args) {
        ChildEx ce = new ChildEx();
        ParentEx pe = new ParentEx();

        pe = ce;
        pe = (ParentEx)pe;
        ce = (ChildEx) pe;

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
