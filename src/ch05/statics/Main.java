package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(); // ++
        // c1.count == 1
        System.out.println(counter.getCount()); // ++
        // c1.count == 2

        Counter counter2 = new Counter();   // ++
        // c2.count == 3
        System.out.println(counter2.getCount()); //++
        // c2.count == 4
    }
}
