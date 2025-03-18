import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.util.Scanner;

public class throw_throws {

    static void function() throws FileNotFoundException{  //Declared in function
        FileReader file = new FileReader("Test.txt");
        
        try{
           int[] arr = new int[3];
           System.out.println(arr[4]);
        }

        catch(ArrayIndexOutOfBoundsException ex){
            //throw ex;  Ye aage throw ho jye ga
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
    }


    public static void main(String[] args) {
     //-----------------     
        try{
            function();
        }

        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
     //-----------------   
        
    }
}
