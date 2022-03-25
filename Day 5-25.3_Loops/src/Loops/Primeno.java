
//Program to Find Prime Number

package Loops;

public class Primeno {

    private int number;
    public Primeno(int number) {
        this.number=number;
    }
    public boolean primecheck() {

        if(number<2)
            return false;

        for(int i=2;i<=number-1;i++)
            if(number%2==0)
                return false;
                return true;
    }

    public int sumUptoN() {
        int sum=0;
        for(int i=0;i<=number;i++)
        {
            sum=sum+i;
        }
        return sum;
    }

    public int sumOfDivisor() {
        //6-Except 1,
         //   2+3=6
        int sum1=0;
        for(int i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                sum1=sum1+i;
            }

        }
        return sum1;
    }

    public void PrintTriangle() {
         for(int i=1;i<number;i++)
         {
             for(int j=1;j<i;j++)
             {
                 System.out.print(j + " ");

             }
             System.out.println("\n");
         }

    }
}
