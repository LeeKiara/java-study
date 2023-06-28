package ch06.list;

import java.util.*;

public class ListEx2 {
    public static void main(String[] args) {

        int nums = 0;

        // 문제 1: Student 클래스가 있다고 가정하고, 다음과 같은 필드를 가지고 있다: name, age, grade.
        // Student 객체들로 이루어진 List를 생성하고, 5명의 학생 정보를 추가해보세요.
        List<Student> stdList = new ArrayList<Student>();
        stdList.add(nums++, new Student("lee", 11, 1));
        stdList.add(nums++, new Student("John kang", 12, 2));
        stdList.add(nums++, new Student("Alice", 13, 3));
        stdList.add(nums++, new Student("John Lee", 24, 14));
        stdList.add(nums++, new Student("park", 25, 15));

        System.out.println("학생정보 모두 출력");
        for (Student result : stdList) {
            result.printStudent();
            // System.out.println("이름만 출력 : "+result.getName());
        }

        System.out.println();
        System.out.println("문제 2: 문제 1에서 생성한 List에서, 이름이 \"John\"인 학생들만 출력하세요.");
        for (Student result : stdList) {
            if(result.getName().contains("John"))
                System.out.println("이름에 John이 있는 경우 : "+result.getName());
        }

        System.out.println();
        System.out.println("문제 3: 문제 1의 List에서, 10학년(grade 10) 이상인 학생들의 이름을 출력하세요.");
        for (Student result : stdList) {
            if(result.getGrade() >= 10)
                System.out.println(result.getName()+" >> "+result.getGrade());
        }


        System.out.println("문제 7: 문제 1의 List에서, 이름이 \"Alice\"인 학생을 찾아서 그 학생의 나이를 5살로 변경하세요. 변경 후, List를 출력하세요.");
        for (Student result : stdList) {
            if(result.getName().contains("Alice"))
                result.setAge(5);   // 나이를 5살로 변경
        }

        for (Student result : stdList) {
            result.printStudent();
        }

        // 문제 8: 문제 1의 List에서, 특정 학년(예: 12학년) 이하인 학생들만 새로운 리스트에 저장하고 출력하세요.
        System.out.println();
        System.out.println("문제 8: 문제 1의 List에서, 특정 학년(예: 10학년) 이하인 학생들만 새로운 리스트에 저장하고 출력하세요.");
        List<Student> youngStudent = new ArrayList<Student>();

        for (Student result : stdList) {
            if(result.getGrade() < 10)
                youngStudent.add(result);
        }

        for (Student result2 : youngStudent) {
            result2.printStudent();
        }
        // 문제 9: 문제 1의 List를 사용하여, 각 학년별 학생 수를 계산하고 출력하세요.
        stdList.add(nums++, new Student("lee2", 11, 1));
        stdList.add(nums++, new Student("John kang2", 12, 2));
        stdList.add(nums++, new Student("Alice2", 13, 3));
        stdList.add(nums++, new Student("John Lee2", 24, 14));
        stdList.add(nums++, new Student("park2", 25, 15));

        int countGrade1 = 0;
        int countGrade2 = 0;
        int countGrade3 = 0;
        int countGrade14 = 0;
        int countGrade15 = 0;

        for (Student result : stdList) {
            int tmpGrade = result.getGrade();

            switch (tmpGrade) {
                case 1:
                    countGrade1++;
                    break;
                case 2:
                    countGrade2++;
                    break;
                case 3:
                    countGrade3++;
                    break;
                case 14:
                    countGrade14++;
                    break;
                case 15:
                    countGrade15++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("1학년 수 : "+countGrade1);
        System.out.println("2학년 수 : "+countGrade2);
        System.out.println("3학년 수 : "+countGrade3);
        System.out.println("14학년 수 : "+countGrade14);
        System.out.println("15학년 수 : "+countGrade15);

        System.out.println();
        // 문제 10: 문제 1의 List에서, 모든 학생의 나이의 평균을 계산하고 출력하세요.
        System.out.println("문제 10: 문제 1의 List에서, 모든 학생의 나이의 평균을 계산하고 출력하세요.");
        int sumAge = 0;
        for (Student result : stdList) {
            sumAge += result.getAge();
        }
        int averageAge = sumAge / stdList.size();
        System.out.println("학생 수 : "+stdList.size()+", 학생 나이 총 합 : "+sumAge+", 그래서 평균은 : "+averageAge);

        System.out.println();
        System.out.println("문제 4: Student 객체들로 이루어진 빈 List를 생성하고, 사용자로부터 3명의 학생 정보(이름, 나이, 학년)를 입력받아 리스트에 추가하세요.");

        List<Student> listEx4 = new ArrayList<Student>();

        String testCase = "scannerInput";
        testCase = "";

        // 사용자로부터 3명의 학생 정보(이름, 나이, 학년)를 입력 받기
        if(testCase.equals("scannerInput")) {
            Scanner scanner;
            for (int i = 0; i < 3; i++) {

                System.out.println("이름을 입력하세요.");
                scanner = new Scanner(System.in);
                String name = scanner.nextLine();

                System.out.println("나이를 입력하세요.");
                scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.println("학년을 입력하세요.");
                scanner = new Scanner(System.in);
                int grade = scanner.nextInt();

                System.out.println(name + ","+age +","+grade);

                listEx4.add(new Student(name, age, grade));
            }
        } else {
            listEx4.add(new Student("name3", 13, 3));
            listEx4.add(new Student("name2", 12, 2));
            listEx4.add(new Student("name1", 11, 1));
        }

        // 문제 5: 문제 4의 List를 이름 순으로 정렬하고 출력하세요.
        System.out.println();
        System.out.println("문제 5: 문제 4의 List를 이름 순으로 정렬하고 출력하세요.");

        System.out.println("--Before Sort-----------");
        for (Student result : listEx4) {
            result.printStudent();
        }

        System.out.println();
        System.out.println("--After Sort-----------");

        // sort case 1
//        Collections.sort(listStudent);

        // sort case 2 -> java 8 부터 지원
        // @ : at mark
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        Collections.sort(listEx4, Comparator.comparing(Student::getName));

        System.out.println();
        System.out.println("--After Sort(Collections.sort)------------");

        for (Student result : listEx4) {
            result.printStudent();
        }

        System.out.println();
        // 문제 5: 문제 4의 List를 나이 순으로 정렬하고 출력하세요.
        System.out.println("문제 5: 문제 4의 List를 나이 순으로 정렬하고 출력하세요.");

        List<Student> listEx5 = new ArrayList<>();
        listEx5.add(new Student("B", 13, 3));
        listEx5.add(new Student("A", 12, 2));
        listEx5.add(new Student("Z", 11, 1));

        System.out.println("--Before Sort-----------");
        for (Student result : listEx5) {
            result.printStudent();
        }

        // 나이순으로 정렬
        Collections.sort(listEx5, Comparator.comparing(Student::getAge));

        System.out.println();
        System.out.println("--After Sort(Collections.sort) > 나이순으로.. ----------");

        for (Student result : listEx5) {
            result.printStudent();
        }

        System.out.println();
        // 문제 6: 문제 4의 List를 학년(grade) 순으로 정렬하고, 정렬된 리스트를 출력하세요.
        System.out.println("문제 6: 문제 4의 List를 학년(grade) 순으로 정렬하고, 정렬된 리스트를 출력하세요.");

        List<Student> listEx6 = new ArrayList<>();
        listEx6.add(new Student("B", 13, 3));
        listEx6.add(new Student("A", 12, 2));
        listEx6.add(new Student("Z", 11, 1));

        System.out.println("--Before Sort-----------");
        for (Student result : listEx6) {
            result.printStudent();
        }

        // 학년(grade) 순으로 정렬
        Collections.sort(listEx6, Comparator.comparing(Student::getGrade));

        System.out.println();
        System.out.println("--After Sort(Collections.sort) > 학년(grade) 순으로.. ----------");
        for (Student result : listEx6) {
            result.printStudent();
        }
    }
}