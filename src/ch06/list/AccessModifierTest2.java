package ch06.list;

public class AccessModifierTest2 {
    public static void main(String[] args) {
        TempService tempService = new TempService();
        tempService.joinUser("Roa", 30);
        tempService.joinUser("Kacey", 25);

        tempService.printUser();
    }
}
