package Enes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilities {
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(arr.get(arr.size() - 1 - i));
        }
        return newArr;
    }  public static ArrayList<Integer> addElement(ArrayList<Integer> arr, int element) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(arr.get(i));
        }
        newArr.add(element);
        return newArr;
    }

    public static ArrayList<String> addMultipleElements(ArrayList<String> arr, String... elements) {
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            newArr.add(arr.get(i));
        }
        for (String element : elements) {
            newArr.add(element);
        }
        return newArr;
    }





}

// TEST
