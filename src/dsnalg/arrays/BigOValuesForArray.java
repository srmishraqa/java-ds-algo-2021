package dsnalg.arrays;

public class BigOValuesForArray {
    public static void main(String[] args) {

        /*
        Advantages of Array
        Retrieve element of an array based on index
        multiply size of the element by its index
        Get the starting address and add the multiplication result to it
        so -> Retrieval by index irrespective of no elements is -> O(1) -> Constant
        */

        /*
        Disadvantages OF Array

        If we don't know the index and search a value then the worst case would be that element which
        we are searching would be at last index of the array
        So the time complexity -> Linear fashion -> O(n) -> where n is the length of the array
         */
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // Lets say we have to retrieve element 7 but we are not aware of the index
        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("Index of 7 is : " + index);
    }
}
