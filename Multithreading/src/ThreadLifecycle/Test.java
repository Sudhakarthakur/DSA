package ThreadLifecycle;

public class Test {
    public static void main(String[] args) {

        // World world = new World();       // this methode for extend Thread
        World world = new World();    // this methode for impliment Runnable methode
        Thread t1 = new Thread(world);
        t1.start();
        for (int i = 1; i <= 5; i++) {
           System.out.println("hello");
        }
    }
}