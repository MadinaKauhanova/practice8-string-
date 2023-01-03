/*Дан текст. Определить, сколько в нем предложений.*/
import java.util.Scanner;
public class P8task9_69 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        String word = in.nextLine();
        int count = 0;
        
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i)=='.' || word.charAt(i)=='!' || word.charAt(i)=='?') {
                count++;
            }
        }
        System.out.println(count);
    }
}
	