
//Program For LOOPs Practice

package Loops;

public class LoopPrograms {
    private int number;
    LoopPrograms(int number)
    {
        this.number=number;
    }

    public static void main(String[] args) {
        LoopPrograms lp=new LoopPrograms(5);
        System.out.println("SUM IS:" +lp.sumOfNaturalNumber());
        lp.patter();
        lp.doloop();

    }

    private void doloop() {
       int i=1;
        while(i<=4){
            System.out.println("Hello");
            i++;
        }

    }

    private void patter() {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    private int sumOfNaturalNumber() {
        int sum = 0;
        for(int i=0;i<=3;i++)
        {
             sum= sum+i;

        }
        return sum;

    }


}
