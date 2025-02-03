// to find max element in array

import java.util.Scanner;

public class Max_element_in_array {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] ={1,2,3,4,55,66,44,104,35,69,44};

        int max=arr[0];

        for(int x:arr){
            
            if(x>max){
                max=x;
            }

  
        }

        System.out.println(max);
         
        sc.close();
      }

    
}
