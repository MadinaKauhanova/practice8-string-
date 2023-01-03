/* Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же 
букву?
*/
import java.util.Scanner;
public class P8task9_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word");
		String word = in.next();

		int l = word.length();
		char c1 = word.charAt(0);
		char c2 = word.charAt(l-1);
  
        if (c1 == c2) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
}