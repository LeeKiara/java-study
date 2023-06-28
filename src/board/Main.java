package board;

import java.util.Scanner;

class Board {
    private String title;
    private String content;
    private String author;

    public Board(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }


}

class BoardManagement {
    private static Board[] boardArray;  // 게시물 배열
    private static int currentIndex;    // 저장 가능한 게시물 번호 (마직막에 저장된 게시물번호 + 1)

    public BoardManagement() {

    }
    /*
     * 게시물 추가
     * @param String title 제목, String content 내용, String author 저자
     * @return void
     */
    public void addBoard(String title, String content, String author) {

        // 게시물 개수가 게시물 배열의 개수보다 작을 경우에만 게시물 추가
        if (currentIndex < boardArray.length) {

            // 게시물 객체 생성
            Board newBoard = new Board(title, content, author);
            // 생성된 게시물 객체를 게시물 배열에 넣어주기
            boardArray[currentIndex] = newBoard;
            // 저장 가능한 게시물 번호 증가
            currentIndex++;

            System.out.println("게시물이 추가되었습니다.");
        } else {
            System.out.println("더 이상 게시물을 추가할 수 없습니다.");
        }
    }

    // 게시물 목록 보기
    public void displayBoardList() {

        if (currentIndex == 0) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.println("---<게시물 목록 >---");
            System.out.println("===============================");
            System.out.println("번호 \t 제목 \t 내용 \t 작성자" );
            System.out.println("===============================");
            for (int i = 0; i < currentIndex; i++) {
                System.out.print((i + 1));
                System.out.print("\t");
                System.out.print(boardArray[i].getTitle());
                System.out.print("\t");
                System.out.print(boardArray[i].getContent());
                System.out.print("\t");
                System.out.print(boardArray[i].getAuthor());
                System.out.println("\n------------------------------------------------------");
            }
        }

    }

    /*
     * 게시물 상세 조회
     * @param int postIndex 조회할 게시물 번호
     */
    public void viewBoard(int postIndex) {

        //System.out.println("debug >>> postIndex:"+postIndex+", currentIndex:"+currentIndex);

        if (postIndex >= 1 && postIndex <= currentIndex) {
            Board selectedBoard = boardArray[postIndex - 1];
            System.out.println("===== 게시물 상세 정보 =====");
            System.out.println("번호 \t 제목 \t 내용 \t 작성자" );
            System.out.println("===============================");
            System.out.print(postIndex);
            System.out.print("\t");
            System.out.print(selectedBoard.getTitle());
            System.out.print("\t");
            System.out.print(selectedBoard.getContent());
            System.out.print("\t");
            System.out.print(selectedBoard.getAuthor());
            System.out.println("\n------------------------------------------------------");
        } else {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        }

    }

    // 게시물 수정
    public void editBoard(int editIndex, String newTitle, String newContent) {

        if (editIndex >= 1 && editIndex <= currentIndex) {
            // 게시물 배열에서 index에 해당되는 게시물 가져옴
//            Board editBoard = boardArray[editIndex - 1]; // 배열은 0부터 시작이라 게시물번호 - 1 한거임
//            editBoard = new Board(newTitle, newContent, editBoard.getAuthor());
//            boardArray[editIndex - 1] = editBoard;

            Board editBoard = boardArray[editIndex - 1]; // 배열은 0부터 시작이라 게시물번호 - 1 한거임
            boardArray[editIndex - 1] = new Board(newTitle, newContent, editBoard.getAuthor());

            System.out.println("게시물이 수정되었습니다.");

            viewBoard(editIndex);

        } else {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        }
    }
    // 게시물 삭제
    public void deleteBoard(int deleteIndex) {

        if (deleteIndex >= 1 && deleteIndex <= currentIndex) {
            for (int i = deleteIndex - 1; i < currentIndex - 1; i++) {
                boardArray[i] = boardArray[i + 1];
            }
            currentIndex--;

            System.out.println("게시물이 삭제되었습니다.");

        } else {
            System.out.println("유효하지 않은 게시물 번호입니다.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("게시판 크기를 입력하세요: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        boardArray = new Board[capacity];
        currentIndex = 0;

        while (true) {
            System.out.println("\n===== 게시판 메뉴 =====");
            System.out.println("1. 게시물 추가");
            System.out.println("2. 게시물 목록 보기");
            System.out.println("3. 게시물 상세 조회");
            System.out.println("4. 게시물 수정");
            System.out.println("5. 게시물 삭제");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            switch (choice) {
                case 1:     // 1. 게시물 추가
                    // System.out.println("debug....currentIndex:"+currentIndex);

                    if (currentIndex >= boardArray.length) {
                        System.out.println("더 이상 게시물을 추가할 수 없습니다.");
                    } else {

                        System.out.print("게시물 제목을 입력하세요: ");
                        String title = scanner.nextLine();
                        System.out.print("게시물 내용을 입력하세요: ");
                        String content = scanner.nextLine();
                        System.out.print("게시물 작성자를 입력하세요: ");
                        String author = scanner.nextLine();

                        addBoard(title, content, author);
                    }
                    break;

                case 2:
                    displayBoardList();
                    break;

                case 3:     // 게시물 상세 조회
                    System.out.print("조회할 게시물 번호를 입력하세요: ");
                    int postIndex = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거

                    viewBoard(postIndex);

                    break;

                case 4:     // 게시물 수정
                    System.out.print("수정할 게시물 번호를 입력하세요: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거

                    if (editIndex < 1 || editIndex > currentIndex) {
                        System.out.println("유효하지 않은 게시물 번호입니다.");
                    } else {

                        System.out.print("수정할 제목을 입력하세요: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("수정할 내용을 입력하세요: ");
                        String newContent = scanner.nextLine();

                        editBoard(editIndex, newTitle, newContent);
                    }

                    break;

                case 5:
                    System.out.print("삭제할 게시물 번호를 입력하세요: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // 개행 문자 제거

                    deleteBoard(deleteIndex);

                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        BoardManagement boardManagement = new BoardManagement();
        boardManagement.run();
    }

}
