import java.sql.SQLOutput;
import java.util.Scanner;

public class addition {

    public static void main(String[] args)
    {

        addition ad=new addition();
        System.out.println(ad.add());

    }
    int add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no");
        int a=sc.nextInt();
        System.out.println("Enter first no");
        int b=sc.nextInt();
        int sum=a+b;
        //System.out.println(sum);
        return sum;
    }

}
