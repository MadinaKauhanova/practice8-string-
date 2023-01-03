/*. Дан текст. Напечатать все имеющиеся в нем цифры.*/
import java.util.Scanner;
public class P8task9_139 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String word = in.nextLine();
       
       for (int i=0; i<word.length(); i++) {
          for(int j=1; j<=9; j++) {
            if(word.charAt(i) == (""+j).charAt(0)) {
              System.out.println(j);
            }
          }
       }
    }
}
