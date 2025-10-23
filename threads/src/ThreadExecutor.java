public class ThreadExecutor extends Thread {
    private int threadName;

    public ThreadExecutor(int name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadName + " - Count: " + i);
        }
        System.out.println("Thread " + threadName + " has finished execution.");
    }
}
