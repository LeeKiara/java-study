package ch02;

public class CompareLogicalEx {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean result = (a && b) || (c || a);
        System.out.println(result);

        int x = 5;
        int y = 8;

        result = x > y || x == y;
        System.out.println(result);

        boolean p = false;
        boolean q = true;

        result = !(p && q) && (p || q);
        System.out.println(result);

         int val1 = 10;
        int var2 = 20;
        int var3 = 10;

         result = (val1 >= var2) && (val1 != var3); // false && false
        System.out.println(result); // false


        boolean x1 = true;
        boolean y1 = false;

        result = !x1 && (x1 || y1);    // false && true
        System.out.println(result); // false

        int aa = 5;
        int bb = 10;
        int cc = 15;

        result = (aa < bb) && (cc > bb) && (aa + bb == cc); // true && true && true
        System.out.println(result); // ture

        p = true;
        q = false;

        result = (p && q) || (!p && !q); // false || true
        System.out.println(result); // false

        x = 15;
        y = 25;

        result = (x >= y) || (x % y == 0);  // false || false
        System.out.println(result); // false

        a = true;
        b = false;
        c = true;

        result = (a || b) && (c || b); // true && true
        System.out.println(result); // true

        x = 12;
        y = 8;

        result = x < y && x % y == 0;   // false and false
        System.out.println(result); // false
    }
}
