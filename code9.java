abstract class Vehicle {
    
    abstract void start();

   
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class code9 {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); 
        myCar.start(); 
        myCar.stop();  
    }
}
