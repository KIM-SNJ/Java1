package ai0416;

import java.util.Scanner;

public class OverlabifTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== 특정번위 숫자 판별 프로그램 =====");

        System.out.print("*정수를 입력: ");

        int num = s.nextInt();

        if (num>100) {
            if (num < 1000) {
                System.out.printf("입력된 숫자  %d(은)는 100보다 크고 1000보다 작은 숫자이군요.\n", num);
            }
            else {
                System.out.printf("입력된 숫자  %d(은)는 1000보다 큰 숫자이군요.\n", num);
            }
        }
        else {
            System.out.printf("입력된 숫자  %d(은)는 100보다 작은 숫자이군요.\n", num);
        }

        s.close();
    }
}
