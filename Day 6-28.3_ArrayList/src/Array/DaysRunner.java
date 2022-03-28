package Array;

public class DaysRunner {
    public static void main(String[] args) {
         String[] strss={"Vidya","Hire","Sakore","pull"};

          Days day=new Days(strss);
          //Days day=new Days();
          int Legth1=day.findlegth();
          System.out.println("Length:" +Legth1);

          day.print();




    }
}
