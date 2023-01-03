/* Дано слово, состоящее из четного числа букв. Вывести на экран его первую 
половину, не используя оператор цикла.
*/
import java.util.Scanner;
public class P8task9_22 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word consisting of an even number of letters");
		String word = in.next();
		
		int length = word.length()/2;
		String subword = word.substring(0,length);
		System.out.println(subword);
	}
}