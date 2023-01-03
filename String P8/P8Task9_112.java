/*Дано предложение. Удалить из него все символы с n1-го по n2-й (n1 n2)*/
import java.util.Scanner;
public class P8task9_112 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String word = in.nextLine();
       int n1 = in.nextInt();
	   int n2 = in.nextInt();

	   String subWord = word.substring(0,n1);
	   String subWord1 = word.substring(n2,word.length());
       System.out.println(subWord+" "+subWord1);

   }
}