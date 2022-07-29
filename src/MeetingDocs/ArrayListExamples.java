package MeetingDocs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1,40); // 10 , 40, 30

        System.out.println(numbers);

        ArrayList<String> enver = new ArrayList<>();

        enver.addAll(Arrays.asList("Enes","Güngör","İsmail","Betül","Bahar","Güngör","Gökalp","İhsan"));
        System.out.println(enver);

        enver.set(0,"İbrahim");
        System.out.println(enver);

        Collections.swap(enver, 0,1);
        System.out.println("enver = " + enver);

        Collections.swap(enver,0,enver.size()-1);
        System.out.println("enver = " + enver);

        System.out.println(enver.indexOf("Güngör"));
        System.out.println(enver.lastIndexOf("Güngör"));

        boolean r = enver.contains("İbrahim");
        System.out.println(r);

        System.out.println(enver.equals(numbers));
        // System.out.println(numbers.get(1));
        System.out.println("---------------------------------------");

        ArrayList<String> countrys = new ArrayList<>();

        countrys.addAll(Arrays.asList("Turkey","UK","France","England","Egypt","Hungary","Netherland","United State"));

        countrys.removeIf(p -> p.length() >= 10 );


        System.out.println(countrys);


    }

}
