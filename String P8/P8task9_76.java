/*. Дано предложение, в котором имеется несколько букв е. Найти:
а) порядковый номер первой из них;
б) порядковый номер последней из них*/
import java.util.Scanner;
public class P8task9_76 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);	
	    String sentence = in.nextLine();
        int count = 0;
        System.out.println("Pervyi 'e' :");
  
        for (int i=0; i<sentence.length(); i++) {
         if (sentence.charAt(i) =='e') {
           int t = sentence.indexOf("e");
           System.out.println(t+1);
           count++;
           if (count == 1){
             break;
           }
         }
        }

        System.out.println("Posledni 'e':");
        for (int i=0; i<sentence.length(); i++) {
          if (sentence.charAt(i) =='e') {
            int t1 = sentence.lastIndexOf("e");
            System.out.println(t1+1);
            break;
          }
        }

    }
}
