package task.io;
public class Car {
    private boolean engineRunning;

    public Car() {
        this.engineRunning = false;
    }
    public void startEngine() throws Exception {
        if (engineRunning) {
            throw new Exception("Двигатель уже запущен!");
        } else {
            engineRunning = true;
            System.out.println("Двигатель запущен.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();

        try {
            car.startEngine();
            car.startEngine();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}




