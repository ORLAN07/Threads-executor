public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadExecutor threadExecutor = new ThreadExecutor(i);
            threadExecutor.start();
        }
    }
}