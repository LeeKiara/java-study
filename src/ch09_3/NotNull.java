package ch09_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Anotation NotNull 정의

/*
* @Retention : 어노테이션이 어떤 시점까지 유지되어야 하는지를 결정
* - RetentionPolicy.SOURCE: 컴파일 되는 시점에 유지되어, 주로 컴파일 과정에서 코드 생성기에 정보를 전달하기 위해 사용
* - RetentionPolicy.CLASS: 컴파일된 클래스 파일에 포함 됨. 그러나 런타임에는 어노테이션에 대한 정보 접근 불가
* - RetentionPolicy.RUNTIME: 컴파일된 클래스 파일에 포함되며, 런타임 시에 리플렉션을 통해 어노테이션 정보에 접근 가능
*   -> 주로 런타임에 동적으로 동작하는 코드에서 사용됨
*
* @Target : 이 Anotation은 필드에만 부착될 수 있음
* */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface NotNull {
}
