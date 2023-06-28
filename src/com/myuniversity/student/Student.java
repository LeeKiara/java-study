// src/com/myuniversity/student.java (패키지는 폴더 구조로~)
// 패키지 구조를 사용하면 클래스들이 정리되어 있어서 관리가 쉽다.
// 패키지명
// 1차 : 회사(com), 비영리조직(org)
// 2차 : 회사명, 조직명 -> com.naver, com.woohan, org.apache
// 3차 : 제품명, 서비스명, 도메인명(비즈니스 범위명) -> com.naver.search, com.naver.news
// 그 하위 ~
// com.naver.news.sports.baseball;

// 학생들의 정보를 관리하는 클래스들
package com.myuniversity.student;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
