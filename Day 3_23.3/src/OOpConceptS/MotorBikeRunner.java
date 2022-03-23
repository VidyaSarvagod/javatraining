package OOpConceptS;

public class MotorBikeRunner {
    public static void main(String[] args){
        MotorBike ducati=new MotorBike(1000);
        MotorBike honda=new MotorBike(2000);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increasespeed(100);
        //System.out.println(ducati.getSpeed());
        honda.setSpeed(100);
        honda.increasespeed(100);

        ducati.Decrease(50);
        honda.Decrease(50);
       // System.out.println(ducati.getSpeed());

        //int newspeed=ducati.getSpeed();
        //newspeed += 100;
        //ducati.setSpeed(newspeed);

        //System.out.println("**************************************************************");
        //honda.setSpeed(500);
        //honda.increasespeed(100);
        //int newspeed1 = honda.getSpeed() + 100;
        //honda.setSpeed(newspeed1);
       // System.out.println(honda.getSpeed());

        //honda.Decrease(10);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());







    }
}
