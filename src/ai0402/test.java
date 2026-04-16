package ai0402;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수1 ==>");
        int a = s.nextInt();

        System.out.print("정수2 ==>");
        int b = s.nextInt();

        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d - %d = %d\n",a,b,a-b);
        System.out.printf("%d x %d = %d\n",a,b,a*b);
        System.out.printf("%d ÷ %d = %.2f\n",a,b,(double)a/b);
        System.out.printf("%d %% %d = %d\n",a,b,a%b);

    }
}
