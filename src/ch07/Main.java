package ch07;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Roa", 20);
        person.introduce();

        Student s = new Student("Sara", 23, "001");
        s.introduce();
//        s.study();
        System.out.println();

        PersonManager pm = new PersonManager();
        pm.work(s);
        System.out.println();

        Lecture lecture = new Lecture("Lee HM", 44, 15);
        lecture.introduce();
        pm.work(lecture);

//        // 업캐스팅
//        // Student 객체를 Person 타입으로 변환(부모 타입으로 변환)
//        // 자식 객체를 부모 객체에 대입
//        Person p2 = s;
//
//        // 부모 객체의 자식 객체에서 재정의된 메서드 호출
//        // 자식 객체의 메서드 호출
//        p2.work();  // student study()
//        p2.introduce(); // s의 introduce() 호출
//        // 자식 객체의 추가한 메서드/필드는 접근 불가
////        p2.study();
//
//        Person p3 = new Lecture("KIM", 33, 10);
//        p3.work();  // Lecture에 teach()

        // 부모 객체를 자식 객체에 대입,
        // 명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재함
        // 부모객체변수 instanceof 자식클래스 타입
        // 예시)
        // Student s3 = (Student) p3;
        // s3.study();
//
//        if(p3 instanceof Student) {
//            Student s3 = (Student) p3;
//            s3.study();
//        } else {
//            System.out.println("형 변환이 안됩니다.");
//        }

        /*
        // 다형성(
        work(new Student)
        work(new Lecture)

        public void work(Person p) {
            if(p instanceof Student) {
                p.study();
            } else if(p instanceof Student) {
                p.teach();
             }

        }
         */
    }
}
