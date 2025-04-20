// package Regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[abc]", "b"));  //Includes
        System.out.println(Pattern.matches("[^ac]", "b"));  //Any Character Other than a,c
        System.out.println(Pattern.matches("[a-i]", "o"));  //Range
        System.out.println(Pattern.matches("[a-d&&c-h]", "d")); //Range Union
        System.out.println(Pattern.matches("[a-z&&[^e-h]]", "g")); // //Range except e-f
        System.out.println(Pattern.matches("[abc]?", "b"));

    }
}
