package user;

/*
- **회원**
    1. 필드
    - id : String (아이디)
    - name : String (성명)
    - hp : String(핸드폰 번호)
    2. 메서드
    - 생성자(아이디, 성명, 핸드폰번호)
    - getId / setId
    - getName / setName
    - getHp / setHp
 */
public class User {
    int userNo;
    String id;
    String name;
    String hp;

    public User() {

    }
    public User(int userNo, String id, String name, String hp) {
        this.userNo = userNo;
        this.id = id;
        this.name = name;
        this.hp = hp;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void printUserInfo() {
        System.out.println("userNo : " + this.userNo);
        System.out.println("id : " + this.id);
        System.out.println("name : " + this.name);
        System.out.println("hp : " + this.hp);

    }
}
