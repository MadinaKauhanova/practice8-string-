 /*Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.
*/
public class P8task9_16 {
	public static void main(String[] args) {
		String word = "Madina";

		char c1 = word.charAt(1);
		char c3 = word.charAt(3);

		if (c1 == c3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}
}