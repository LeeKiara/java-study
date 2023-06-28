package ch06.list;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {

        // 빈 List(ArrayList)를 생성하세요.
        List<String> list = new ArrayList<String>();

        // List에 "사과", "바나나", "체리"를 순서대로 추가하세요.
        list.add("사과");
        list.add("바나나");
        list.add("체리");
        list.add("콩");

        System.out.println("ArrayList에 담은 후 찍어보기");

        for(String result : list) {
            System.out.println(result);
        }

        System.out.println();
        System.out.println("Collections.reverseOrder() 적용 후 출력");
        // 내부적으로 구버전 자바이면 merge-sort, 현재 자바버전이면 tim-sort
        list.sort(Collections.reverseOrder());
        for(String result : list) {
            System.out.println(result);
        }
        System.out.println();

        // List에 있는 요소의 개수를 출력하세요.
        System.out.println("List에 있는 요소의 개수를 출력하세요.");
        System.out.println(list.size());

        // List의 두 번째 요소를 출력하세요.
        System.out.println("List의 두 번째 요소를 출력하세요.");
        System.out.println(list.get(1));

        // List에서 "바나나"를 제거하세요.
        System.out.println("List에서 바나나를 제거하세요.");
        list.remove(1);

        // List에 "딸기"를 추가하고, "사과"와 "딸기" 사이에 "오렌지"를 삽입하세요.
        System.out.println("List에 \"딸기\"를 추가하고, \"사과\"와 \"딸기\" 사이에 \"오렌지\"를 삽입하세요.");
        list.add("딸기");
        list.add(1, "오렌지");

        // List에 있는 모든 요소를 출력하세요.
        System.out.println("List에 있는 모든 요소를 출력하세요.");
        for(String result : list) {
            System.out.println(result);
        }

        System.out.println();
        System.out.println();

        // List가 비어 있는지 확인하세요.
//        for(String result : list) {
//            if(result == null)  {
//                System.out.println("result is null");
//            } else {
//                System.out.println(result);
//            }
//        }

        // List에 있는 요소들 중에서 가장 긴 문자열을 찾아 출력하세요.
        // List에 있는 요소들 중에서 가장 짧은 문자열을 찾아 출력하세요.
        int tmpMaxLen = 0;
        int tmpMinLen = 0;
        int findMaxIndex = 0;
        int findMinIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i==0) {
                tmpMaxLen = list.get(0).length();
                tmpMinLen = list.get(0).length();
            } else {
                // 다음 요소의 길이를 비교하여 다음요소 길이가 길 경우
                if(tmpMaxLen < list.get(i).length()) {
                    tmpMaxLen = list.get(i).length();
                    findMaxIndex = i;
                }

                // 다음 요소의 길이를 비교하여 다음요소 길이가 짧을 경우
                if(tmpMinLen > list.get(i).length()) {
                    tmpMinLen = list.get(i).length();
                    findMinIndex = i;
                }
            }
        }
        System.out.println("List에 있는 요소들 중에서 가장 긴 문자열은 "+list.get(findMaxIndex) + " 입니다.");
        System.out.println("List에 있는 요소들 중에서 가장 짧은 문자열은 "+list.get(findMinIndex) + " 입니다.");

        // List의 모든 요소를 대문자로 변환하세요.
        List<String> listEng = new ArrayList<String>
                (List.of("banana", "apple", "kiwi", "mango"));
        System.out.println("List의 모든 요소를 대문자로 변환하세요.");
        for (String result : listEng) {
            System.out.println(result.toUpperCase());
        }

        System.out.println();
        // List에 있는 요소들을 알파벳순으로 정렬하세요.
        System.out.println("List에 있는 요소들을 알파벳순으로 정렬하세요.");
        listEng.sort(null);
        for (String result : listEng) {
            System.out.println(result.toUpperCase());
        }

        System.out.println();
        System.out.println("List에 있는 요소들을 거꾸로 배치하세요.");
        List<String> list2 = new ArrayList<String>();
        int loop = 0;
        // List에 있는 요소들을 거꾸로 배치하세요.
        for (int i = list.size()-1; i >= 0 ; i--) {
//            System.out.println("** debug : ("+loop+") "+list.get(i));
            list2.add(loop, list.get(i));
            loop += 1;
        }
        System.out.println("--Before--------------");
        for (String result : list) {
            System.out.println(result);
        }
        System.out.println("--After--------------");
        for (String result : list2) {
            System.out.println(result);
        }

        System.out.println();
        System.out.println("List에 있는 \"체리\"가 있는지 확인하세요.");
        // List에 있는 "체리"가 있는지 확인하세요.
        for (String result : list) {
            if(result.equals("체리")) {
                System.out.println("List에 \"체리\"가 있네요."+result);
            }
        }

        System.out.println();
        System.out.println("List의 마지막 요소를 제거하세요.");
        // List의 마지막 요소를 제거하세요.
        list.remove(list.size()-1);
        for (String result : list) {
                System.out.println(list.indexOf(result) + ":"+result);
        }

        System.out.println();

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(0, new Student("조정빈"));
        listStudent.add(1, new Student("김성우"));
        listStudent.add(2, new Student("양수열"));

        System.out.println("--Before Sort------------");
        for (Student result : listStudent) {
            System.out.println(result.getName());
        }

        System.out.println("--After Sort(버블정렬 알고리즘)------------");

        // 버블정렬
        for (int i = 0; i < listStudent.size()-1; i++) {
            for (int j = i; j < listStudent.size(); j++) {
                Student tmpStd1 = listStudent.get(i);
                Student tmpStd2 = listStudent.get(j);

                if(tmpStd1.getName().compareTo(tmpStd2.getName()) > 0) {
                    String tmpStr =  tmpStd1.getName();
                    tmpStd1.setName(tmpStd2.getName());
                    tmpStd2.setName(tmpStr);
                }

//                listStudent.set(i, tmpStd1);
//                listStudent.set(j, tmpStd1);
            }
        }

        for (Student result : listStudent) {
            System.out.println(result.getName());
        }

        List<Student> tmpLstStudent = new ArrayList<Student>();

        // sort case 1
//        Collections.sort(listStudent);

        // sort case 2 -> java 8 부터 지원
        // @ : at mark
        // 클래스명::필드명 -> 해당 클래스의 필드로 무엇인가를 하겠다.
        // 컬렉션.sort(lstStudent, Comparator.comparing(클래스명::필드(getter))
        Collections.sort(listStudent, Comparator.comparing(Student::getName));

        System.out.println();
        System.out.println("--After Sort(Collections.sort)------------");
        for (Student result : listStudent) {
            System.out.println(result.getName());
        }
//        System.out.println(new String("가").compareTo(new String("가")));
//        System.out.println(new String("가").compareTo(new String("하")));
//        System.out.println(new String("하").compareTo(new String("가")));



    }
}
