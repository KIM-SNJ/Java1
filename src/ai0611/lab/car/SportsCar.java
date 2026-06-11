package ai0611.lab.car;

public class SportsCar extends Car{
    @Override
    public void SpeedUp(int up) {
        super.SpeedUp(up);
        if(this.speed >= 200){
            this.speed = 200;
        }

    }
}
