package Loops;

public class PrimenoRunner {
    public static void main(String[] args) {

        Primeno pno=new Primeno(6);
        System.out.println(("********************Check Prime*************"));
        boolean isprime=pno.primecheck();
        System.out.println("*********************Add Up To N*************");
        System.out.println("isPrime:" + isprime);
        System.out.println(pno.sumUptoN());
        System.out.println(("********************Sum OF dIVISOR**********"));
        System.out.println(pno.sumOfDivisor());
        pno.PrintTriangle();




    }
}
