public class code15 {
    public static void main(String[] args) {
        int a=193743;
        int count=0;
        while(a!=0){
            count++;
            a=a/10;
        }
        System.out.println(count);
    }
}
