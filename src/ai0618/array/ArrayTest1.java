package ai0618.array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        String[] subjects = {"프로그래밍언어실습", "데이터베이스", "융합UI실습", "인공지능개론", "직업과 경력개발"};
        int sum = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < scores.length; i ++) {
            System.out.print("- " + subjects[i] +"성적 입력(정수값) : ");
            scores[i] = s.nextInt();
        }

//        for (int i = 0; i < scores.length; i ++) {
//            System.out.printf("%d ", scores[i]);
//            sum += scores[i];
//        }

        int i = 0;
        for (int score : scores) {
            System.out.print(subjects[i] + " : " + score + " ");
            sum += score;
            i ++;
        }

        System.out.printf("\n성적 합계 : %d", sum);
        System.out.printf("\n성적 평균 : %f", (float)sum/scores.length);

        s.close();
    }
}
