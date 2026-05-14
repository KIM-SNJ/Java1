package ai0514;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        int sum;
        while(true) {
            int d1 = r.nextInt(6) + 1;
            int d2 = r.nextInt(6) + 1;
            int d3 = r.nextInt(6) + 1;
            count ++;
            if (d1==d2 && d2 == d3) {
                System.out.printf("3개의 주사위는 모두 %d입니다\n", d1);
                System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다.", count);
                break;
            }
        }
    }
}
