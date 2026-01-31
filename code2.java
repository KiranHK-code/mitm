
class Animal{
    void animal(){
        System.out.println("animal are cat human lion");
    }
}
class Mammals extends  Animal{
    void legs(){
        System.out.println("mammals have four legs ");
    }

}
class Human extends Mammals{
    void human(){
        System.out.println("only human have two legs");
    }
} 
public class code2{
    public static void main(String[] args) {
        Human h1=new Human();
        h1.animal();
        h1.legs();
        h1.human();

        

    }

}
