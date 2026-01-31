public class code18 {
    public static void main(String[] args) {
        int [] arr={1,6,2,8,9};
        int element = 6;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == element){
                System.out.println("we found an element in index of "+i);
            }
            else{
                System.out.println("we cannot find the number"+ element);
            }
        }
    }
}
