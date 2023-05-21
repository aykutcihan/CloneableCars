package CloneableCars;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Brand1", "Model1", "Red", "Gasoline", 50000, true);
        car1.showCarInfo();

        Car car2 = car1.clone();
        car2.setColor("Blue");
        car2.setPrice(52000);
        car2.showCarInfo();
    }
}
