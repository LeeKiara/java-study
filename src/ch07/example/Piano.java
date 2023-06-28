package ch07.example;

public class Piano extends Instrument {

    @Override
    public void play() {

        super.setName("피아노");
        super.setSound("도미솔시도래도");
        super.play();

        System.out.println(super.getName()+"를 연주합니다. "+super.getSound());


    }
}
