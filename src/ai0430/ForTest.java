package ai0430;

public class ForTest {
    public static void main(String[] args) {
        String[] subjectArr = {"자바프로그래밍언어", "데이터베이스", "융합UI실습"};
        for (int i = 0; i < 3; i++) {
            System.out.printf("저는 %s를 이번에 처음 공부해요.\n", subjectArr[i]);
        }
    }
}
