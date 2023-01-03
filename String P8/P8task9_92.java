/* Дано предложение. Все его символы, стоящие на четных местах, заменить 
буквой ы.*/
import java.util.Scanner;
public class P8task9_92 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a sentence");
	    
        String word = in.nextLine();
        char word1;
        for (int i=0; i<word.length(); i++) {
            word1 = word.charAt(i);
            if (i%2 != 0){
                word1 = 'ы';
            }
            System.out.print(word1);
        }

	}
}