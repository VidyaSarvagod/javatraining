//Program For Find Squre and Cube

package Loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class PrintCube {



    //Function for Square
    public void printSuare() {
        int Num=0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter The Number");
            Num=sc.nextInt();
            System.out.println("Square is:" +(Num*Num));

        }while(Num>0);

    }
    //Function For Cube
    public void printCube()
    {
        int Num=-1;
        Scanner sc = new Scanner(System.in);
        do
        {
            if(Num != 0)
            System.out.println("Enter The Number");
            Num=sc.nextInt();
            System.out.println("Cube is:" +(Num*Num*Num));

        }while(Num>0);
        System.out.println("Thank you");

    }

}

