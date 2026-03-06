package MODULE_4;

final class Parent {
    void show() {
        System.out.println("This is a final class");
    }
}

public class FinalClass {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.show();

    }
}
