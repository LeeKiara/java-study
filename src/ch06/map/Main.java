package ch06.map;

import ch06.list.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /*
         * HashMap : 유일한 값을 보장하기 위해 Hash함수를 이용, 추가할 때 정열X -> 성능이 좋아짐
         * TreeMap : 정열하고 싶을때, 추가할때 이진트리로 정렬, 성능이 떨어지지만 키값으로 정렬
         * */
//        Map<String, Student> students = new TreeMap<>();
        Map<String, Student> students = new HashMap<>();

        /*
         객체 추가
         키(key, 유일값): 학번
         값(value): 학생정보
         맵변수.put(엔트리(K,V))
        */
        students.put("e-01-00001", new Student("kang"));
        students.put("e-01-00002", new Student("lee"));
        students.put("e-01-00003", new Student("kim"));

        // 객체 검색/조회
        // 맵변수.keySet() -> key목록을 반환함(키는 중복이 안됨)
        // Set : 집합, 원소의 중복이 없는 자료구조
        // 일반적으로 Map, 연관배열, dictionary, key-value pair
        // 자료구조는 정렬해서 저장하지 않음
        for(String key : students.keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println(key +" : "+students.get(key).getName());
        }
        System.out.println();

        System.out.println("맵변수.get(키값) -> 값 객체");
        for(Student s : students.values()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println(s.getName());
        }

        System.out.println();
        // 키 값 존재 여부 확인
        if(students.containsKey("e-01-00002")) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println("key \"e-01-00002\" 의 value : "+students.get("e-01-00002").getName());

        }
        System.out.println();

        // 출력할때만 정열하기 위해 TreeMap으로 다시 생성
        // for 문에서 객체 생성시 장점 : for문 안에서만 사용
        // Map<String, Student> sortedStudents = new TreeMap<>(students);
        for(String key : new TreeMap<>(students).keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println(key +" : "+students.get(key).getName());
        }

        // 객체의 값 수정
        // 맵젼수.get(키값) : 키값으로 조회 후 뭔가를 처리
        Student s = students.get("e-01-00002");
        // setter

        // 객체 삭제
        students.remove("e-01-00002");
        // 모두 삭제
        students.clear();
    }
}
