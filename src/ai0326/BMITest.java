package ai0326;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.println("체중을 입력하세요(kg) : ");
        double kg = s.nextDouble();

        System.out.println("키를 입력하세요(cm) : ");
        double cm = s.nextDouble();

        System.out.println("이름을 입력하세요 : ");
        String name = c.nextLine();

        double m = cm/100;

        double BMI = kg/Math.pow(m, 2);

        System.out.printf("%s님의 BMI수치는 %.2f입니다.", name, BMI);
    }
}
