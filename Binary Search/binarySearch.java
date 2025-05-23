// package Binary Search;

public class binarySearch {
    public static void main(String[] args) {
        // int[] arr = new int[8];
        int[] arr = {1,3,5,7,9,11,13};
        System.out.println(SearchaNumb(arr, 6));
        
    }
    
    private static int SearchaNumb(int[] arr, int number){
       int first =0;
       int last = arr.length-1;
       while(first <= last){
        int middlePos = (first + last)/2;
        int middleNumb = arr[middlePos];
        if(middleNumb == number)  return middlePos;
        if(number<middleNumb) {
            last = middlePos - 1;
        } else {
            first = middlePos + 1;
        }
       }
        return -1;
    }
}
