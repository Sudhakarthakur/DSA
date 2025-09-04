package ThreadLifecycle;
public class World extends Thread {  // secand way to exatends thread is
    @Override                        // extend Thread = implements Runnable
    public void run() {
        for( ; ;){
            System.out.println(Thread.currentThread().getName());// kown the thread name
        }
    }
}
