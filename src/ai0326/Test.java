package ai0326;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.print("받는사람 : ");
        String name = s.nextLine();
        System.out.print("주소 : ");
        String ad = s.nextLine();
        System.out.print("무게(g) : ");
        int g = s.nextInt();

        int dc = g*5;

        System.out.println("** 받는 사람 ==> "+ name);
        System.out.println("** 주소 ==> "+ ad);
        System.out.println("** 배송비 ==> "+ dc +"원");



    }
}
