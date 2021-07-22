package dsnalg.arrays;

public class CreateArray {
    public static void main(String[] args) {
        // While declaring We have to declare the size
        // We can't alter the size of array once declared
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
/*
Arrays - stored as one contiguous block in memory - not scattered throughout memory
It is One huge block and that's why We need to declare the size in the beginning while creating array so the JVM
exactly knows how much memory block it needs to allocate
The length can't be increased / decreased coz
When we increase the size the same contiguous block can't be extend further

1. Every element of an array occupies same amount of space in memory - int array each index will occupy 4 bytes

2. In case of Objects like Strings - we always store reference address of that object and address will of same size
irrespective of the object size

3.if we know starting memory address of the array is x and each block takes size of y,
to find i th element the memory block address will be x+i*y

4.if we know the index of an element the time to retrieve an element in which ever index is will be same 

 */