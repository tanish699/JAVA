// package MAPS;

import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap<>(); //initializing
        empId.put("Tanish", 1);// adding values;
        empId.put("a", 2);
        empId.put("b", 3);
        empId.put("c", 4);
        System.out.println(empId); //To print whole map
        System.out.println(empId.get("a"));
        System.out.println(empId.containsKey("a"));
        System.out.println(empId.containsKey("d"));
        System.out.println(empId.containsValue(1));
         
        empId.put("a", 69); //updates the value
        empId.replace("Tanish", 99); //replaces
        empId.putIfAbsent("kamal", 78); 
        System.out.println(empId);


    }
    
}


/*
 * Maps is set of key value pair
 */