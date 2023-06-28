package ch06.map;

import ch06.list.Student;

import java.util.*;

public class MapEx {

    public static void main(String[] args) {
        // 문제 1: 자바의 Map 인터페이스를 사용하여, 학번을 키로하고, Student 객체를 값으로 하는 맵을 생성하세요.
        // Student 클래스는 이름과 나이를 가지고 있어야 합니다.
        Map<String, Student> students = new HashMap<>();

        // 문제 2: 문제 1에서 생성한 맵에 5명의 학생을 추가하세요.
        students.put("001", new Student("Roa", 20));
        students.put("002", new Student("Casey", 30));
        students.put("003", new Student("Jamse", 18));
        students.put("004", new Student("Marian", 50));
        students.put("005", new Student("Lisa", 40));

        System.out.println("원본 출력");
        for(String key : students.keySet()) {
            System.out.println(students.get(key).getName() + ","+students.get(key).getAge());
        }

        // 문제 3: 문제 2에서 생성한 맵에서 특정 학번의 학생을 검색하는 코드를 작성하세요.
        System.out.println(" 특정 학번의 학생을 검색하는 코드");
        String findKey = "003";
        if(students.containsKey(findKey)) {
            System.out.println(students.get(findKey).getName() + ","+students.get(findKey).getAge());
        }

        // 문제 4: 문제 2에서 생성한 맵에서 특정 학번의 학생을 제거하는 코드를 작성하세요.
        students.remove("004");

        System.out.println();
        System.out.println("문제 5: 문제 2에서 생성한 맵의 모든 학생을 출력하는 코드를 작성하세요.");
        for(String key : students.keySet()) {
            System.out.println(students.get(key).getName() + ","+students.get(key).getAge());
        }

        System.out.println();
        System.out.println("문제 6: 문제 2에서 생성한 맵에 있는 학생들의 나이 평균을 계산하는 코드를 작성하세요.");
        int sumAge = 0;
        for(String key : students.keySet()) {
            sumAge += students.get(key).getAge();
        }
        System.out.println("학생들의 나이 평균 : " + (sumAge / students.size()));

        System.out.println();
        System.out.println("문제 7: 문제 2에서 생성한 맵에 있는 학생들 중 가장 나이가 많은 학생을 찾는 코드를 작성하세요.");

        // 다른 방법
        // sort case 2 -> java 8 부터 지원
        // @ : at mark
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        System.out.println("-- 컬렉션.sort 다른 방법 ------");

        // Collections.sort()를 사용하기 위해서 Map을 List 형태로  가져와야 함
        // Map.entrySet()을 이용하여 Map의 Entry Set을 List 형태로 저장한다
        // entrySet() : key와 value 값이 모두 필요할 경우 사용
        List<Map.Entry<String, Student>> entryList = new LinkedList<>(students.entrySet());



        // 나이순으로 Sort
        entryList.sort(new Comparator<Map.Entry<String, Student>>() {
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                Student tmpStd1 = o1.getValue();
                Student tmpStd2 = o2.getValue();

                // 오름차순
                if(tmpStd1.getAge() > tmpStd2.getAge()) {
                    return 1;
                } else if(tmpStd1.getAge() < tmpStd2.getAge()) {
                    return -1;
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        String tmpKey = "";
        Student tmpStd = null;

        // 정렬된 리스트에서 마지막 학생정보를 가져온다.
        for(Map.Entry<String, Student> entry : entryList) {
            tmpKey = entry.getKey();
            tmpStd = entry.getValue();
            //System.out.println("key :"+tmpKey +", value - name : "+tmpStd.getName()+", age :"+tmpStd.getAge());
        }
        System.out.println("===>");
        System.out.println("key :"+tmpKey +", value - name : "+tmpStd.getName()+", age :"+tmpStd.getAge());

//        Map<String, Student> sortStudent = new TreeMap<>(students);
//        for(String key : sortStudent.keySet()) {
//            System.out.println(sortStudent.get(key).getName() + ","+sortStudent.get(key).getAge());
//        }

        // 문제 8: 문제 2에서 생성한 맵에 있는 학생들의 이름을 알파벳 순서로 정렬하여 출력하는 코드를 작성하세요
        // 이름을 알파벳 순서로 정렬
        entryList.sort(new Comparator<Map.Entry<String, Student>>() {
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                Student tmpStd1 = o1.getValue();
                Student tmpStd2 = o2.getValue();

                // 오름차순
                if(tmpStd1.getName().compareTo(tmpStd2.getName()) > 0) {
                    return 1;
                } else if(tmpStd1.getName().compareTo(tmpStd2.getName()) < 0) {
                    return -1;
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println();
        System.out.println("문제 8: 문제 2에서 생성한 맵에 있는 학생들의 이름을 알파벳 순서로 정렬하여 출력하는 코드를 작성하세요");
        for(Map.Entry<String, Student> entry : entryList) {
            tmpKey = entry.getKey();
            tmpStd = entry.getValue();
            System.out.println("key :"+tmpKey +", value - name : "+tmpStd.getName()+", age :"+tmpStd.getAge());
        }


        System.out.println();
        System.out.println("문제 9: 문제 2에서 생성한 맵에서 학생들의 이름에 특정 문자열이 포함되어 있는 경우만 출력하는 코드를 작성하세요.");
        // 문제 9: 문제 2에서 생성한 맵에서 학생들의 이름에 특정 문자열이 포함되어 있는 경우만 출력하는 코드를 작성하세요.
        String findStr = "se";
        System.out.println("특정 문자열 : "+findStr);
        for(String key : students.keySet()) {
            if(students.get(key).getName().indexOf(findStr) > -1)
                System.out.println(students.get(key).getName() + ","+students.get(key).getAge());
        }

        // 문제 10: 문제 2에서 생성한 맵에 특정 이름의 학생이 있는지 확인하는 코드를 작성하세요.
        System.out.println();
        System.out.println("문제 10: 문제 2에서 생성한 맵에 특정 이름의 학생이 있는지 확인하는 코드를 작성하세요.");
        String findName = "Casey";
        System.out.println("특정 이름 : "+findName);
        String resultKey = "";
        for(String key : students.keySet()) {
            if(students.get(key).getName().equals(findName)) {
                resultKey = key;
                break;
            }
        }
        if(!resultKey.equals(""))   {
            System.out.println("** find name : "+students.get(resultKey).getName());
        } else {
            System.out.println("찾는 학생이 없습니다.");
        }



    }
}
