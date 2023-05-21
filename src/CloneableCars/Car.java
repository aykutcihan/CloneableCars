package CloneableCars;

public class Car implements Cloneable {
    private String brand;
    private String model;
    private String color;
    private String engineType;
    private double price;
    private boolean isAvailable;

    public Car(String brand, String model, String color, String engineType, double price, boolean isAvailable) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "In Stock" : "Out of Stock"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    protected Car clone() {
        Car car = null;

        try {
            car = (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error occurred while cloning the Car");
            e.printStackTrace();
        }
        return car;
    }
}
