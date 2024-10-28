class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается...");
    }

    static void drive() throws Exception {
        System.out.println("Машина поехала.");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception ignore) {
        }
    }
}