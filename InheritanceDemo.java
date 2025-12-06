
class Vehicle {
    String brand;
    int speed;

    
    Vehicle(String brand, int speed) 
    {
        this.brand = brand;
        this.speed = speed;
    }

    
    void showDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle 
{
    String model;

    Car(String brand, int speed, String model)
    {
        super(brand, speed); 
        this.model = model;
    }

    void showCarDetails() {
        showDetails(); 
        System.out.println("Model: " + model);
    }
}


public class InheritanceDemo
 {
    public static void main(String[] args) 
    {
        Car c = new Car("Tata Motars", 150, "Tata Seirra 2025");
        c.showCarDetails();
    }
}

