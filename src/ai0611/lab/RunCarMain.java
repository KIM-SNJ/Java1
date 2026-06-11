package ai0611.lab;

import ai0611.lab.car.SchoolBus;
import ai0611.lab.car.SportsCar;

import java.util.Scanner;

public class RunCarMain {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int speed;

        SchoolBus schoolBus = new SchoolBus();
        SportsCar sportsCar = new SportsCar();

        while (true) {
            System.out.print("가속할 속도를 입력 : ");
            speed = s1.nextInt();
            if (speed == -1) {
                break;
            }
            schoolBus.SpeedUp(speed);
            sportsCar.SpeedUp(speed);

            System.out.printf("스쿨버스 속도 : %d\n", schoolBus.speed);
            System.out.printf("스포츠카 속도 : %d\n", sportsCar.speed);
        }
        s1.close();
    }
}
