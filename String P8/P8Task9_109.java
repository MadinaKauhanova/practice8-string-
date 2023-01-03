/*. Дано слово. 
а) Удалить из него третью букву.
б) Удалить из него k-ю букву*/
import java.util.Scanner;
public class P8task9_109 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word:");
      String word = in.next();
      char n = word.charAt(2);
    
      String res = word.replace(""+n, "");
      System.out.println(res);
    
      int m = in.nextInt();
      char m1 = word.charAt(m);
      res = word.replace(""+m1, "");
    
      System.out.println(res);  
   }
}