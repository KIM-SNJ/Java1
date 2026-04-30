package ai0430;

import java.util.Scanner;

public class LAB_Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("====== 출생년도에 따른 12간지 ======");
        System.out.println("출생년도를 입력해 주세요: ");
        int year = s.nextInt();
        String animal = "";

        switch (year%12) {
            case 0:
                animal="원숭이";
                break;
            case 1:
                animal="닭";
                break;
            case 2:
                animal="개";
                break;
            case 3:
                animal="돼지";
                break;
            case 4:
                animal="쥐";
                break;
            case 5:
                animal="소";
                break;
            case 6:
                animal="호랑이";
                break;
            case 7:
                animal="토";
                break;
            case 8:
                animal="용";
                break;
            case 9:
                animal="뱀";
                break;
            case 10:
                animal="말";
                break;
            case 11:
                animal="양";
            default:
                animal = "잘못된 출생년도입니다.";
        }

        System.out.printf("출생년도 %d는 %s띠 입니다.", year, animal);

        s.close();
    }
}
