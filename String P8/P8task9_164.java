/* Дано предложение из 10 слов. Заполнить ими массив из 10 элементов*/
import java.util.Scanner;
public class P8task9_164 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence that has ten words:");
       String word = in.nextLine();
       
       String word1[] = word.split(" ");
       for (String word2: word1) {
          System.out.println(word2+" ");
       }
   }
}
