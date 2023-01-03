/* Дано предложение. Найти длину его самого короткого слова.*/
import java.util.Scanner;
public class P8task9_171 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String word = in.nextLine();
       
       String[] sentence = word.split("");
       int n = sentence[0].length();
       for (int i=1; i<sentence[i].length(); i++) {
       	 if (n<=sentence[i].length()) {
       	 	System.out.println(n);
       	 }else {
       	 	System.out.println(sentence[i]);
       	 }
       } 

   }
}
