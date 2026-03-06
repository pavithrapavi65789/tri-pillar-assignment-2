package MODULE_5;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}