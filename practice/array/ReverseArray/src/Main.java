//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ReverseArray reverseArray = new ReverseArray();
        int[] newArr = reverseArray.reverseArray(arr);
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}