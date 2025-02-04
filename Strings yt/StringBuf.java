public class StringBuf {
  public static void main(String[] args) {

    //StringBuffer Is Mutable

    StringBuffer sb = new StringBuffer("Hello");
    StringBuffer sb1 = new StringBuffer("Chitkara");
    StringBuffer sb2 = new StringBuffer("qwertyuioplkjhgf");
    StringBuffer sb3 = new StringBuffer("Ashok Chitkara ");
    StringBuffer sb4 = new StringBuffer("madhu Chitkara ");
    StringBuffer sb5 = new StringBuffer("Rajpura ");
    StringBuffer sb6 = new StringBuffer("Patiala ");
    //StringBuffer is threat safe
    String sub2;
    String sub1;

    // Append methods
    System.out.println(sb.append(" World "));
    System.out.println(sb.append(123));
    System.out.println(sb.append('!'));
    System.out.println(sb.append(45.67));

    // Insert methods
    System.out.println(sb1.insert(7, 999)); 
    System.out.println(sb1.insert(5, ",")); 
    System.out.println(sb1.insert(11, '$'));
    
    // Replace method
    System.out.println(sb2.replace(7, 10, " Java "));

    // Delete methods
    System.out.println(sb3.delete(5, 7));
    System.out.println(sb3.deleteCharAt(0));

     // Reverse method
     System.out.println(sb4.reverse());

     // Extracting Content
     char ch = sb5.charAt(3);
     System.out.println(ch);
     sb5.setCharAt(4, 'X');
     System.out.println(sub1 = sb5.substring(5));
     System.out.println(sub2 = sb5.substring(2, 7));

     // Convert to String
     String finalString = sb.toString();

  }
    
}
