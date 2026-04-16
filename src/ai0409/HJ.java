package ai0409;

import java.util.Scanner;

public class HJ {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("성적을 입력해 주세요");
        System.out.print("\n프로그래밍언어실습(3학점) : ");
        double a = s.nextDouble();
        System.out.print("웹프로그래밍기초(3학점) : ");
        double b = s.nextDouble();
        System.out.print("프롬프트엔지니어링(2학점) : ");
        double c = s.nextDouble();

        double avg = (a*3+b*3+c*2)/8;

        System.out.printf("3과목 평균: %.2f\n",avg);

        s.close();
    }
}
