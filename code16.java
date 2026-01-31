public class code16 {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4} ;
        int i;
        int maxi=numbers[0];
        for (i=1; i <numbers.length; i++){
            if (maxi< numbers[i]){
                maxi=numbers[i];
            }
            

        }
        System.out.println(maxi);
    }
}
