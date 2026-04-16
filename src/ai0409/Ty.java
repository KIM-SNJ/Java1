package ai0409;

public class Ty {
    public static void main(String[] args) {
        byte bt = 127;
        short st = 300;
        st=bt;
        int it=st;
        System.out.println("it변수에 저장된 값 : "+it);
        long lg = 70000000;
        float fl =1000;
        fl = lg;
        fl=1000.0f;
        fl=1000.0F;
        fl = (float)1000.0;

        double db = 20000;
        db=fl;
        db=bt;
        db=207.999;

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)(c+3));

        boolean b = true;

        System.out.println(bt==st);

    }
}
