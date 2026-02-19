public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable task using lambda expression
        Runnable task = () -> {
            System.out.println("Background task started...");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing step " + i);
                try {
                    Thread.sleep(1000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Background task completed!");
        };

        // Create thread
        Thread thread = new Thread(task);

        // Start thread (runs asynchronously)
        thread.start();

        System.out.println("Main thread continues execution...");
    }
}
