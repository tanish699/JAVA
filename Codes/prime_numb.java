//Print all prime numbers till n;

import java.util.Scanner;

public class prime_numb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           
        int n = scan.nextInt();
        int c=0;

        for(int i=2; i<=n; i++){
           boolean is_prime = true;
           
           for(int j = 2; j<i; j++){
              if(i%j==0){
                is_prime=false;
                break;
              }
           }

           if(is_prime){
            System.out.println(i);
           }
            
        }
        
        scan.close();
    }
}
