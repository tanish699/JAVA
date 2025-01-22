import java.util.Scanner;

public class Check_no_substrings {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        getAllPallidromeSubstrings(str1);
        sc.close();
      }


      public static void getAllPallidromeSubstrings(String s) {
        int n = s.length();
        int count = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);

                
                if (isPalindrome(substring)) {
                    count++;
            }
        }
        
      }System.out.println(count);
    
}
    public static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}
