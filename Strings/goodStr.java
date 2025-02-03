import java.util.Scanner;

//Good SubString is substring which contains only vovels

public class goodStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(getGoodSubString(str1));

        sc.close();

    }

    public static int getGoodSubString(String s){
        int n = s.length();
        int z=0;
        int maxLength = 0;  
        int currentLength = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k=0; k < j; k++) {
                  char c = s.charAt(k);

                
            }
        }
        return z;    
    }

    public static int isGood(String s) {
          
        
        
        
            
            if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
                currentLength++;  
                maxLength = Math.max(maxLength, currentLength);  
            } else {
                currentLength = 0;
            }
        }
        
        return maxLength;
    }



    
}
