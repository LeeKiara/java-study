package ch07.example;

/*
    Instrument 클래스를 만들고 play라는 메서드를 추가해주세요. 
    Guitar와 Piano라는 두 개의 하위 클래스를 만들고, play 메서드를 오버라이드 해서 각각 다른 출력을 반환하도록 해주세요.
    Guitar -> play()
    "악기를 연주합니다."
    "띠링띠링"
    
    Piano -> play()
    "악기를 연주합니다."
    "도미솔시도래도"
* */
public class Instrument {
    // 악기명
    private String name;
    private String sound;

    public Instrument() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void play() {
        System.out.println("악기를 연주합니다.");
    }
}
