package user;

/*
- **회원관리**
    1. 필드
    - 회원배열 : 회원
    - 회원수 : int
    2. 메서드
    - 생성자
    - 회원가입
    - 회원수정
    - 회원삭제
    - 회원목록조회
    - 회원정보찾기
    - 회원수 조회
    - 메뉴실행
 */
public class UserManagement {

    User[] userList;    // 회원배열
    int numUsers;   // 회원수

    // 회원배열 생성자 : 배열 최대크기를 입력 받아 회원배열 생성하고, 회원수 1로 초기화한다.
    public UserManagement(int maxArraySize) {
        userList = new User[maxArraySize];
        numUsers = 1;
    }

    // 회원가입
    public void register(String id, String name, String hp) {
        User user = new User();
        user.setUserNo(numUsers);
        user.setId(id);
        user.setName(name);
        user.setHp(hp);
        userList[numUsers-1] = user;

        numUsers++;
    }

    // 회원정보 찾기
    public User findUserInfo(String id) {
        // 회원수 만큼 loop롤 돌려 회원정보 찾기
        for (int i = 0; i < numUsers; i++) {
            // 회원배열에서 회원 객체 꺼내기
            User oneUser = userList[i];
            if( oneUser.getId().equals(id) )    {
                return oneUser;
            }
        }
        return null;
    }

    // 회원정보 찾기
    public int findUserIndex(String id) {
        // 회원수 만큼 loop롤 돌려 회원정보 찾기
        for (int i = 0; i < numUsers; i++) {
            // 회원배열에서 회원 객체 꺼내기
            User oneUser = userList[i];
            if( oneUser.getId().equals(id) )    {
                return i;
            }
        }
        return 0;
    }

    // 회원수정
    public void updateUser(String id, String name, String hp) {
        User oneUser = findUserInfo(id);

        if(oneUser != null) {

        }

    }
    // 회원삭제
}
