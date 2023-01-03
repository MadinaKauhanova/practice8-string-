/* Дано предложение. Все буквы е в нем заменить буквой и. */
import java.util.Scanner;
public class P8task9_90 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a sentence");

        String sentence = in.nextLine();

        String newsentence = sentence.replaceAll("e","i");
        System.out.println(newsentence);
		
	}
}
