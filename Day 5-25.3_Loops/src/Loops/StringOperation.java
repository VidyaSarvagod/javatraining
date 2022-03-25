//Program For String Operation.

package Loops;

import java.util.Scanner;

public class StringOperation {
    static String str="VIDYA";
     public static void main(String[] args) {
        StringOperation str1 = new StringOperation();
       // str1.Operation();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter U R Choic");
         int choice= sc.nextInt();
         switch (choice){
             case 1:str1.Length();
                    break;
             case 2:
                 System.out.println(str.toLowerCase());
                 break;
             case 3:
                 String String1="Java";
                 String String2="Lang";
                 System.out.println("Concatination is:" +String1+String2);
                 break;
             case 4:
                 String String11="Java";
                 String String22="Java";
                 boolean Result=(String11.equals(String22));
                 System.out.println("Equality is:" +Result);
             case 5:
                 System.out.println(str.charAt(0));

             case 6:









         }

     }



     private void Length() {
        System.out.println(str.length());

    }


}


