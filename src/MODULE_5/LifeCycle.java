package MODULE_5;

class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        LifeCycle t = new LifeCycle();

        System.out.println("Thread state: " + t.getState());

        t.start();

        System.out.println("Thread state after start: " + t.getState());
    }
}
