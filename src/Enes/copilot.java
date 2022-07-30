package Enes;
import java.util.*;

public class copilot {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = addElement(arr,11);
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {11,12,13,14,15,16,17,18,19,20};

        int[] sum = ArrayUtilities.sumOfTwoArrays(arr2,arr3);
        System.out.println(Arrays.toString(sum));

        System.out.println("----------------------------------------------------");

        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4 = ArrayListUtilities.addElement(arr4,11);
        System.out.println(arr4);

        ArrayList<String> arr5 = new ArrayList<>();
        arr5 = ArrayListUtilities.addMultipleElements(arr5,"Enes","Güngör","İsmail","Betül","Bahar","Güngör","Gökalp","İhsan");
        System.out.println(arr5);
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
