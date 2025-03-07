import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ARRay_Lists {

    public static void prt(ArrayList<Integer> list){
        System.out.println("------");
        System.out.println(list);
        System.out.println("------");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //Declaration of list
        list.add(1);  //Add an element in ArrayList
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(0)); //print element by index
        System.out.println(list);  //print whole list
        System.out.println("Size "+list.size());
        System.out.println("-----");
        for(int x : list){
            System.out.println(x);
        }
        System.out.println("-----");
        System.out.println(list.contains(3));  //existance of an element in list;
        System.out.println(list.contains(50));

        // list.remove(2);  //Remove an element by index
        list.remove(Integer.valueOf(4)); //Remove an element by value
        list.add(2,30); //Adds element to list
        prt(list);

        list.set(0, 10);  //Change the value at index
        prt(list);

        //Convert ArrayList to array
        Integer[] arr = list.toArray(new Integer[0]);
        //list.toArray();
        for(int x : arr){
            System.out.println(x);
        }

        //Sorting of ArrayList
        Collections.sort(list);
        prt(list);
      


    }
}
