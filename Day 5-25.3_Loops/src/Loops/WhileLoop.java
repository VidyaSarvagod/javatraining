//Program for While Loop

package Loops;

public class WhileLoop {

    private int number;

    public WhileLoop(int number1) {
        this.number = number1;
    }

    public void PrintSuareUptoLimit() {
        //30
         int i=1;
         while(i*i<number)
         {
             System.out.print((i * i) + " ");
             i++;
         }
        System.out.println("\n");
    }

    public void PrintCubeUptoLimit() {
         int j=1;
         while (j*j*j<number)
         {
             System.out.println(j*j*j + " ");
             j++;
         }

    }
}

