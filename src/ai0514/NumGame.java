package ai0514;

import java.util.Random;
import java.util.Scanner;

public class NumGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int Gn = 0;
        int Pn, Cn;
        while (true) {
            Gn ++;
            Cn = r.nextInt(5)+1;
            System.out.printf("게임 %d회 : 컴퓨터가 생각한 숫자는? ==> ", Gn);
            Pn = s.nextInt();
            if (Cn == Pn) {
                System.out.printf("축하드립니다. 컴퓨터가 생각한 숫자는 %d입니다.", Cn);
                break;
            }

            System.out.printf("아쉽습니다. 컴퓨터가 생각한 숫자는 %d입니다. 다시 시도해 보세요.\n\n", Cn);

        }
        s.close();
    }
}
