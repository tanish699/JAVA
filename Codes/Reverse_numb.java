//Reverse a numb

import java.util.Scanner;

public class Reverse_numb {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int reversed=0;


        while(n!=0){
         int digit = n%10;
         reversed = reversed*10 + digit;
         n/=10;


        }

        System.out.println(+reversed);

        scan.close();
    }
    
}
