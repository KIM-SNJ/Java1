package ai0514;

public class GGD2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j ++) {
                System.out.printf("%d x %d = %d\t",j,i,i*j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j ++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
