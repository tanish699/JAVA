import java.util.ArrayList;
import java.util.*;

public class Array_List {
     public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
      //   List<Integer> arr = new ArrayList<>();

        //add element to list 
        arrayList.add(10);
        arrayList.add(20);

        arrayList.add(1, 30);
        System.out.println(arrayList);

        // arrayList.add(5, 99); //Out of index
        

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        arrayList.set(0, 69);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList.contains(69));
        System.out.println(arrayList);
     }    
}
