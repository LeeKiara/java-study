package ch09.ex3;

import java.util.List;

public class CollectionUtil<T> {

    private int occurrenceCount;

    // 주어진 리스트에서 특정 요소의 개수를 세는 메서드
    public int countOccurrences(List<T> numbers, T target) {
        System.out.println("** debug..... target >> "+target);

        for(T item : numbers) {
            if(item.equals(target)) {
                System.out.println("** debug.....numbers >> "+item);
                this.occurrenceCount++;
            }
        }

        return this.occurrenceCount;
    }
}
