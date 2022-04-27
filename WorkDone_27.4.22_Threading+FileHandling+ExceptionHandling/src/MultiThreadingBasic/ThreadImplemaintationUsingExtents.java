package MultiThreadingBasic;

//Thread is implemainted using extend and runnable
public class ThreadImplemaintationUsingExtents extends Thread {

    public void run()
    {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        ThreadImplemaintationUsingExtents threadingBasic=new ThreadImplemaintationUsingExtents();
        threadingBasic.start();

    }

}

