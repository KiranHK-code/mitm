class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override 
    public void sound() {
        
        super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        
        Animal myAnimal;

        myAnimal = new Dog(); 
        myAnimal.sound();     

        System.out.println();

        myAnimal = new Cat(); 
        myAnimal.sound();    
    }
}
