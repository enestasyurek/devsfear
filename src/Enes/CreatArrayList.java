package Enes;
import java.util.*;

public class CreatArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> newArr = CreateArray();
        System.out.println("newArr = " + newArr);

    }


    public static ArrayList<Integer> CreateArray(){

        ArrayList<Integer> oldArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers u want in the list");
        int size = sc.nextInt();
        int i = 1;
        while (size > 0){
            System.out.println("insert the number " + i);
            int numbers = sc.nextInt();
            oldArr.add(numbers);
            size--;
            i++;
        }

        return oldArr;
    }


}
