package ai0423;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("밤 10시가 넘으면 청소년은 PC방을 이용할 수 없습니다.\n나이를 입력해 주세요. ==> ");
        int a = s.nextInt();
        String result;

        if (a>=20) {
            result = "가능";
        }
        else {
            result = "불가능";
        }

        System.out.printf("당신의 나이는 %d이므로 밤 10시 이후 PC방 이용이 %s합니다.", a, result);
    }
}
