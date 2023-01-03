/* Дано слово из четного числа букв. Поменять местами его половины. Задачу 
решить двумя способами:
1) без использования оператора цикла;
2) с использованием оператора цикла.
*/
import java.util.Scanner;
public class P8task9_37 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word consisting of an even number of letters");
		String word = in.next();

//1)
	/*	int length = word.length()/2;
		int length1 = word.length()/2;
		String subword = word.substring(0,length);
		String subword1 = word.substring(length1);
		System.out.println(subword1+" "+subword);
	*/

//2)
	    int length1 = word.length()/2;
        String m = "";
        String m1 = "";
	    for (int i=0; i<word.length()/2; i++) {
			m = m + word.charAt(i);
			m1 = m1 + word.charAt(length1+i);
		}

	    System.out.println(m1+m);
     
	}
}