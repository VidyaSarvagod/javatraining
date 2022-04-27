package ExceptionHandling;

public class GFG extends Thread {

    // Function to check if thread is running
        public void run()
        {
            System.out.println("Thread is running");

            // Using for loop to iterate
            for (int i = 0; i < 10; ++i) {
                System.out.println("Thread loop running " + i);
            }
        }

        // Main Driver Method
        public static void main(String[] args)
        {

            // Try-catch block to detect exception
            try {

                // Creating new thread
                GFG ob = new GFG();

                throw new RuntimeException();
            }

            // Catch block to handle exception
            catch (Exception e) {

                // Exception handler
                System.out.println(
                        "Another thread is not supported");
            }
        }
    }


