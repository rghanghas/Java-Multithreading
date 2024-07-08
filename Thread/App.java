
public class App 
{
    public static void main( String[] args )
    {
        
        // When extending the Thread Class
        for (int i = 0; i <= 3; i++) {
            
            MultiThreadClass obj = new MultiThreadClass(i);

            obj.start();

            // If we want the current thread to finish before executing others
            try {
                obj.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // When implementing the Runnable Interface
        for (int i = 0; i <= 3; i++) {
            
            MultiThreadClass2 obj2 = new MultiThreadClass2(i);
            
            Thread myThread = new Thread(obj2);
            
            myThread.start();
        }

    }
}
