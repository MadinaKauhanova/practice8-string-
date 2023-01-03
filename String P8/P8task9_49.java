/* Дано слово. Добавить к нему в начале и конце столько звездочек, сколько 
букв в этом слове*/
import java.util.Scanner;
public class P8task9_49 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word");
		String word = in.next();
        int length = word.length();
        System.out.println(length);
        String s = "*";

        for (int i=0; i<=word.length()-1; i++) {
        	s+= "*";
        }
         
        System.out.println(s+word+s); 
	}
}