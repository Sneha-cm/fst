package Activity1;
public  class car1 {
    public static void main(String[] args) {
       
        Car myCar = new Car("Black", "Manual", 2014);

        myCar.displayCharacteristics();
        
        myCar.accelerate();
        myCar.brake();
    }
}