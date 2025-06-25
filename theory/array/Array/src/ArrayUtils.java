// An array is a fixed-sized, indexed, ordered collection of elements of the same types
// Arrays in java are objects, stored in the heap memory
// Once the size is set, it cannot be changed
// Can be accessed by index
// Especially: Arrays are efficient in terms of the access time O(1)
public class ArrayUtils {
    private int[] arr;

    public ArrayUtils(int[] arr) {
        this.arr = arr;
    }
    // Some of methods that array must have
    public void PrintArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
