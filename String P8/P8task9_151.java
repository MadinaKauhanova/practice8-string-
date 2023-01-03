import java.util.Scanner;
public class P8task9_151 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int word = in.nextInt();
       String array[] = new String[word];
       int arrayword[] = new int[word];
            
       for ( int i=0; i<word; i++ ) {
            array[i] = in.next();
            arrayword[i] = array[i].length();    
       }
 
       for ( int i=0; i<word; i++ ) {
            if (arrayword[i] >= 11) {
                int n = arrayword[i]-2;
                String m = array[i].charAt(0)+Integer.toString(n)+array[i].charAt(arrayword[i]-1);
                System.out.println(m);
            } else {
                System.out.println(array[i]);
            }
       }
   }
}
  
        
  int main()
{
    int n, a, b, c, k = 0;
    cin >> n ;
    for(int i = 0; i < n; ++i){
        cin >> a >> b >> c;
        if(a + b + c > 1)
            ++k;
    }
    cout << k;
    return 0;
}                
    
