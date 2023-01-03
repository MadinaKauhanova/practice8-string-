/* Дано предложение. Составить программу, которая выводит все вхождения 
в предложение двух заданных символов*/
import java.util.Scanner;
public class P8task9_55 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a sentence");

		String word = in.nextLine();
		char n1 = 'n';
		char n2 = 'a';
		for (int i=0; i<word.length(); i++) {
			char m = word.charAt(i);
			if (m == n1 || m == n2) {
                 System.out.println(i+": "+m);
			}
		}
	}
}