package MODULE_4;

public class StaticExample {
    static int count = 0;

    StaticExample() {
        count++;
    }

    static void showCount() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();

        StaticExample.showCount();
    }
}
