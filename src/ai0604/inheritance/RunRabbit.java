package ai0604.inheritance;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30,50);
        hr1.xMove10P(1);
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("아주 좋은");

        MountainRabbit mr1 = new MountainRabbit();
        mr1.shape = "세모";
        mr1.setLocation(50,20);
        mr1.xMove10M(2);
        mr1.printInfo();
        mr1.mountainName = "북한산";
        mr1.eatGrass("민들레");
    }
}
