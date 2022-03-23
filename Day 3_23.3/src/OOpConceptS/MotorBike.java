package OOpConceptS;

public class MotorBike {


    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed1) {
        if(speed1>0) {
            this.speed = speed1;
        }
    }

    void start(){
        System.out.println("Bike Started");
    }
    public void increasespeed(int howmuch){
        this.speed=this.speed+howmuch;
    }
    public void Decrease(int howmuchdecrese){
        this.speed=this.speed-howmuchdecrese;
    }

}
