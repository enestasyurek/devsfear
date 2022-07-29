package Enes;
import java.util.*;

public class copilot {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = addElement(arr,11);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] addElement(int[] arr, int element){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;
    }


}
