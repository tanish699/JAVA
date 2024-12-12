// Input and Output in arrays


import java.util.Scanner;

public class Input_Output_in_array {
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int x:arr){
            System.out.print(x);
        }
  
         
        sc.close();

    }
    
}
