import java.util.Scanner;

public class matrix {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{11,12,13,14,15},{16,17,18,19,20,},{21,22,23,24,25},{26,27,28,29,30},{31,32,33,34,35}};  
        
        // Spiral Printing of matrix

        int total =25;
        int top =0, bottom=0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }    
}


