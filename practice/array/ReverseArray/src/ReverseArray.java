// Summary Problem:
// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.
// View full of the problem via this link:
// https://www.geeksforgeeks.org/dsa/program-to-reverse-an-array/

public class ReverseArray {
    private int[] arr;
    public ReverseArray(int[] arr) {
        this.arr = arr;
    }
    public ReverseArray() {}

    public int[] reverseArray(int[] arr) {
        int[] afterReverseArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            afterReverseArr[i] = arr[arr.length - i - 1];
        }
        return afterReverseArr;
    }

}
