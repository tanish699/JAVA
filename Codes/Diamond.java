// Draw Diamond pattren
//            *
//         *  *  *
//      *  *  *  *  *
//         *  *  *
//            * 


import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        int n =scan.nextInt();

        int m = (n+1)/2;

        for(int i=1;i<=m;i++){

            for(int j=1;j<=m-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();

        
    }
    
}
