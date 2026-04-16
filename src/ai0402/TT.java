package ai0402;

import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("시험 점수를 입력하세요. : ");
        int score = s.nextInt();

        if (score>=70){
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
    }
}
