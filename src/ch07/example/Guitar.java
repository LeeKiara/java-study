package ch07.example;

public class Guitar extends Instrument {

    @Override
    public void play() {
        super.setName("기타");
        super.setSound("띠링띠링");
        super.play();

        System.out.println(super.getName()+"를 연주합니다. "+super.getSound());
    }
}
