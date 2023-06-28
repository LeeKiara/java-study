package ch09_3;

import java.lang.reflect.Field;

public class User {

    @NotNull
    private String username;

    @NotNull
    private String password;

    // 생성자, getter, setter 등의 코드 생략

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    * NotNull anotaion을 사용한 유효성 검사 예제
    *
    * */
    public void validate() {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    Object value = field.get(this);
                    if (value == null) {
                        throw new IllegalArgumentException("Field '" + field.getName() + "' is required.");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
