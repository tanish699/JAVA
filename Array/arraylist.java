import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        //arraylist -> a resizeable array

        ArrayList<String> food = new ArrayList<String>();
       food.add("Pizza");
       food.add("Sandwich");
       food.add("Burger");

       for(String x : food){
        System.out.println(x);
       }
    }
    
}
