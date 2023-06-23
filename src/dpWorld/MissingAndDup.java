package dpWorld;
//{42,44,45,46,46,47}
public class MissingAndDup {
    public static void driver(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                System.out.println("duplicate number " + arr[i]);
            }
            else if(arr[i]+1 != arr[i+1]){
                System.out.println("missing number " + (arr[i]+1));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {42,44,45,46,46,47};
        driver(arr);
    }
}
