package ai0430;

import java.util.Scanner;

public class LAB_SetLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact = 1;
        System.out.print("학생의 수를 정해주세요 : ");
        int friends_num = s.nextInt();

        for (int i = 1; i<= friends_num; i++) {
            fact = fact*i;
        }
        System.out.printf("학생 %d명을 순서대로 세우는 경우의 수 : %d", friends_num, fact);
    }
}
