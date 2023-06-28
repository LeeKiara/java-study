package ch08.exercise7;

public class Main {
    public static void main(String[] args) {
        System.out.println("파워공격         ");
        Gladiator gladiator = new Gladiator();
        gladiator.powerAttack();
    }
}

class GameCommon {
    int hp;
    int power;

    GameCommon() {
        System.out.println("GameCommon Constructor");
    }

    void attack() {
        System.out.println("공격");
    }
}

class Warrior extends GameCommon {
    int weapon;

    public void defence() {
        System.out.println("방어");
    }
}

class Gladiator extends GameCommon {
    int shield;

    Gladiator() {
        System.out.println("Gladiator Constructor");
    }
    public void powerAttack() {
        System.out.println("파워공격");
    }
}

class Wizard extends GameCommon {
    int heal;

    public void healing(Object target) {
        System.out.println("치료마법");
    }
}