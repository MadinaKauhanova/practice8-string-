/* Дано слово. Перенести первые k его букв в конец.
Задачу решить двумя способами:
1) без использования оператора цикла;
2) с использованием оператора цикла.
*/
import java.util.Scanner;
public class P8task9_40 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
//1)		
	/*	System.out.print("Enter a word consisting of an even number of letters");
		System.out.println(" and enter a number");
		String word = in.next();
		int k = in.nextInt();

		
		String subword = word.substring(0,k);
		String subword1 = word.substring(k,word.length());
		System.out.println(subword1+" "+subword);
     */
 //2)       
        System.out.println("Enter word and number");
        String word = in.next();
        int k = in.nextInt();
        int length = word.length();

        String word0 = "";
        String word1 = "";

        for (int i=0; i<k; i++) {
            String word2 = word.substring(0,i+1);
            word0 = word2;
            String word3 = word.substring(k,length);
            word1 = word3;
        }
        System.out.println(word1 + word0);
	}
}
