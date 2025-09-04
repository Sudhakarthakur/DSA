package ThreadLifecycle;

class MyThread extends  Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);   // state go to waiting state
        }catch (InterruptedException e) {
            System.out.println(e);      // not error but same say that, error print
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();    // new thread created
        System.out.println(t1.getState());
        t1.start();    // here thread go to start
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);  // here thread go to waitng mode for 200 mile secand
        System.out.println(t1.getState());
        t1.join();   // this is terminated thread execution
        System.out.println(t1.getState());

    }
}
