import java.util.Scanner;

public class Pallidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        for(int i = st1.length()-1; i>=0;i--){
            str2.append(st1.charAt(i));
        } 

        if(str2.toString().equals(st1)){
            System.out.println("String"+st1+"is Pallidrome");
        }
        else{
            System.out.println("String"+st1+"is not pallidrome");
        }


        sc.close();
    }
    

    
}
