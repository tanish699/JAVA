import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,-2,-3,1,2,4,-1,-2};
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int element :arr){
            // if(hmap.containsKey(element)){
            //     hmap.put(element, hmap.get(element)+1);
            // } else {
            //     hmap.put(element, 1);
            // }

            hmap.put(element, hmap.getOrDefault(element, 0)+1);
        }
    }
    
}



/*
 * Maps
 * -Hash Map
 * -Tree Map
 * -Linked Hash Map
 * -Hash Table
 */
