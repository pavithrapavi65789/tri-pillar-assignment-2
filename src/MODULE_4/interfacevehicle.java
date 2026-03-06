package MODULE_4;

public class interfacevehicle {
    interface Vehicle{


    void start();
}

static class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

}
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
