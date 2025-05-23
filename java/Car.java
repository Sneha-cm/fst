package Activity1;
public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(String color, String transmission, int make) {
        this.color = color;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }
    public void displayCharacteristics() {
        System.out.println("Car color: " + color);
        System.out.println("Car transmission: " + transmission);
        System.out.println("Car make: " + make);
        System.out.println("Number of tyres: " + tyres);
        System.out.println("Number of doors: " + doors);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}

