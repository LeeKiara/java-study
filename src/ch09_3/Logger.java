package ch09_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 모든 클래스의 메서드를 읽어서 자동으로 로깅하는 기능입니다.
* 이를 위해 클래스 수준의 애너테이션은 빼고,
* @Logger 애너테이션을 구현하고,
* 이를 활용하여 메서드 실행 로그를 자동으로 출력하는 코드
* */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Logger {
}
