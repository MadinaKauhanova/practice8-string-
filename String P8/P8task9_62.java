/* Дано предложение. Определить долю (в %) букв а в нем.*/
import java.util.Scanner;
public class P8task9_62 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a sentence");
		String word = in.nextLine();
		int length = word.length();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a') {
                count++;
            }
        }

        System.out.println("Number of letters 'a': "+count);
        System.out.println("Numbers of letters in a sentence: "+word+": "+length);
        int procent = (count * 100)/length;
        System.out.println("Procent of letters 'a' in a sentence: "+procent + "%");
		
	}
}
