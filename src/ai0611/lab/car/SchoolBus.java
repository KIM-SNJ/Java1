package ai0611.lab.car;

public class SchoolBus extends Car{
    @Override
    public void SpeedUp(int up) {
        super.SpeedUp(up);
        if (this.speed >= 60) {
            this.speed = 60;
        }
    }
}
