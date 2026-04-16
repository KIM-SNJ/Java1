package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class AgeTest02 {
    public static void main(String[] args) {
        System.out.println("나이 계산");
        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요");
        int birthday = s.nextInt();
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int age = nowYear - birthday;
        System.out.println("당신의 현제 나이는 "+ age +"입니다");
        s.close();
    }
}