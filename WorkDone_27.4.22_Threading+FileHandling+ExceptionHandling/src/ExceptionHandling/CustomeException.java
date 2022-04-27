package ExceptionHandling;

public class CustomeException
{
    static void find(int age)
    {

        if (age > 20)
        {
            throw new ArithmeticException("age greater");
        }
        else
        {
            System.out.println("granted");
        }
    }

    public static void main(String[] args)
    {
        find(67);
    }
}



