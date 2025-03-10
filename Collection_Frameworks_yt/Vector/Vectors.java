import java.util.Vector;



public class Vectors {

    public static void print(Vector<Integer> vec){
        System.out.println("------");
        System.out.println(vec);
        System.out.println("------");
    }

    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(); //Initialization
        Vector<Integer> vec1 = new Vector<>(20);  //we can define the capacity
        
        /*If the vector hit the max capicity than the capacity will  incriment by 3*/
        Vector<Integer> vec2 = new Vector<>(20,3); 
        
        //DefaultInitial capacity 10
        System.out.println(vec.capacity());
        System.out.println(vec1.capacity());
        
        vec.add(0);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        print(vec);
        System.out.println("Size of Vector " + vec.size()); //Size
        
        //Add element by index
        vec.add(0, -1); 
        print(vec);
   
        System.out.println(vec.get(3));
        
        //Change an Element
        vec.set(3, 69);
        print(vec);

        //Remove An Element
        vec.remove(0);  //By Index
        vec.remove(Integer.valueOf(5)); //By Value
        print(vec);

        //To check if vector List is empty or not
        System.out.println(vec.isEmpty());
        System.out.println(vec2.isEmpty());
        System.out.println("---");

        //To check if the vector list contains specific element or not
        System.out.println(vec.contains(69));
        System.out.println(vec.contains(8));

        // To remove all the lements from vector list
        vec1.add(18);
        vec1.add(20);
        vec1.add(23);
        print(vec1);
        vec1.clear();
        print(vec1);




    }
    
}
