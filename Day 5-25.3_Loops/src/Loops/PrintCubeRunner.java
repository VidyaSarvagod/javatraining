package Loops;

import java.util.Scanner;

public class PrintCubeRunner {
    public static void main(String[] args) {
        System.out.println("Enter U R Choice");
        Scanner sc = new Scanner(System.in);
        PrintCube pc = new PrintCube();
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                pc.printSuare();
                break;
            case 2:
                pc.printCube();
                break;

        }

    }

}
