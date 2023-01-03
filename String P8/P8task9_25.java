/* Из слова информатика путем "вырезок" и "склеек" его букв получить слова 
форма и тик.
*/
public class P8task9_25 {
	public static void main(String[] args) {
		String word2 = "информатика";
		String subWord = word2.substring(2,7);
		String subWord3 = word2.substring(7,word2.length()-1);

		System.out.println(subWord);
		System.out.println(subWord3);
	}
}