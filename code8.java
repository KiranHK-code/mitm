class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    

    public void showParentSound() {
       
        super.sound();
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

public class code8 {
    public static void main(String[] args) {
        
        Animal myAnimal = new Dog();

      
        myAnimal.sound(); 

        
        myAnimal.eat();  

        
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.bark();          
            myDog.showParentSound();
    }
}}