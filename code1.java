
class Animal{
    void animal(){
        System.out.println("cat");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");

    }

}

public class code1{
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.meow();
        c1.animal();
    }

}