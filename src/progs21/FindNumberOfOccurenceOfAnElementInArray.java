package progs21;

public class FindNumberOfOccurenceOfAnElementInArray {

    public static void findOccur(int[] arr,int num){
        int output = 0;
//        if (Arrays.asList(arr).contains(num)) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == num) {
//                    output++;
//                }
//            }
//        }
        boolean flag = false;
        for(int element:arr){
            if(element == num){
                flag = true;
                break;
            }
        }
        if(flag){
            for(int element:arr){
                if(element == num){
                    output++;
                }
            }
            System.out.println(output);
        }
        else{
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,4,4,5,6};
        findOccur(arr,4);
    }
}
