package ai0423;

import java.util.Scanner;

public class BMITest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.print("체중을 입력하세요(kg) : ");
        double kg = s.nextDouble();

        System.out.print("키를 입력하세요(cm) : ");
        double cm = s.nextDouble();

        System.out.print("이름을 입력하세요 : ");
        String name = c.nextLine();

        double m = cm/100;

        double BMI = kg/Math.pow(m, 2);

        String A;

        if (BMI>=30) {
            A = "2단계 비만";
        }
        else if (BMI>=25) {
            A = "1단계 비만";
        }
        else if (BMI>=23) {
            A = "위험체중";
        }
        else if (BMI>=18.5) {
            A = "정상";
        }
        else {
            A = "저체중";
        }

        System.out.printf("%s님의 BMI수치는 %.2f, %s입니다.", name, BMI, A);
    }
}
