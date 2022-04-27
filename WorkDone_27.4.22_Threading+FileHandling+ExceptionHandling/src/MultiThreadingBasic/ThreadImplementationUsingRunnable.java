package MultiThreadingBasic;

class ThreadImplementationUsingRunnable implements Runnable {

         public void abc()
        {
            System.out.println("Thread is Running");
        }

        public static void main(String[] args) {

             ThreadImplementationUsingRunnable threadImplementationUsingRunnable=new ThreadImplementationUsingRunnable();
             Thread T1=new Thread((threadImplementationUsingRunnable ));
             T1.start();


        }


    @Override
    public void run() {

    }
}



