import java.io.*;
import java.util.Scanner;
import java.io.File;

public class ArrayList {
    public static void main(String[] args) throws IOException {
        //System.out.println("Enter how many users");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many users");
        int Users=sc.nextInt();
        ArrayList<Integer>arraylistforusers=new ArrayList<Integer>(Users);

        

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc1.nextLine();


        int ch=0;

        do {
            System.out.printf("\n ***Welcome %s In Banking System Application***", name).println();
            System.out.println(" 1.Fixed Deposit\n 2.Exit ");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            //ch = 0;

            switch (ch) {
                case 1:
                    System.out.println("********************************This is our Bank FD Details***************************************");

                    try {
                        File Obj = new File("C:\\javatraining\\Day 11_4.3.22\\src\\abc.txt");
                        Scanner Reader = new Scanner(Obj);
                        while (Reader.hasNextLine()) {
                            String data = Reader.nextLine();
                            System.out.println(data);
                        }
                        Reader.close();
                    }
                    catch (FileNotFoundException e) {
                        System.out.println("An error has occurred.");
                        e.printStackTrace();
                    }

                    System.out.println("Enter account no");
                    int accountno = (int) sc.nextDouble();

                    System.out.println("Enter Principle");
                    int principal = (int) sc.nextDouble();

                    //System.out.println("Enter the Duration");
                   // int duration = sc.nextInt();
                    int ch1=0;
                    do {
                        //System.out.printf("\n ***Welcome %s In Banking System Application***", name).println();
                        System.out.println(" 1.7-45 days \n 2.46-90 \n 3.91-6 months \n 4.6 months<1 yr ");
                        System.out.println("Enter your choice: ");
                        ch1 = sc.nextInt();

                        switch (ch1) {
                            case 1: //7-45 Days
                                if (principal <=100000) {
                                    double interest = principal + (principal * ch1 * 5.50) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=200000) {
                                    double interest = principal + (principal * ch1 * 5.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=300000) {
                                    double interest = principal + (principal * ch1 * 5.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }

                                break;

                            case 2:
                                //46-90 Days
                                if (principal <=100000) {
                                    double interest = principal + (principal * ch1 * 6.50) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=200000) {
                                    double interest = principal + (principal * ch1 * 5.30) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=300000) {
                                    double interest = principal + (principal * ch1 * 5.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                break;

                            case 3:
                                //46-90 Days
                                if (principal <=100000) {
                                    double interest = principal + (principal * ch1 * 7.50) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=200000) {
                                    double interest = principal + (principal * ch1 * 6.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=300000) {
                                    double interest = principal + (principal * ch1 * 5.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                break;
                            case 4:
                                //46-90 Days
                                if (principal <=100000) {
                                    double interest = principal + (principal * ch1 * 5.30) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=200000) {
                                    double interest = principal + (principal * ch1 * 8.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }
                                else if (principal>=300000) {
                                    double interest = principal + (principal * ch1 * 5.60) / 100;
                                    System.out.printf("Total ammount is:%f",interest).println();

                                }


                        }


                    }while( ch1!=4);
                    break;

                case 2:
                    System.out.println("See you soon...");
                    break;




            }
        }while(ch!=2);
    }


}

