package ch09_2;

/*
* 임시저장소
* Cache라는 제네릭 클래스를 작성하세요. 이 클래스는 다음을 수행해야 합니다.
----------------------------------------------------------------
 클래스 이름: Cache
 제네릭 형식: T
 클래스 변수: data (제네릭 타입 T)
 제공되는 메소드: getData()와 setData(T data)
*
* CollectionUtil<String> util = CollectionUtil<>();
* */
public class Cache<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
