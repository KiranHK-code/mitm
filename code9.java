public class code9{
class Student {
    int id;
    String name;
    int age;

    public Student(int a,String b,int c) {
        id=a;
        name=b;
        age=c;
    
    }
    void display(){
        System.out.println(id+""+name+""+age);
    }}
    
        public static void main(String[] args) {
                Student s1=new Student(1,"abc",12);
    }
    
}
