
import java.util.Scanner;

public class ReverseAll {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        input.nextLine();
        for (int i = 0; i < line; i++) {
            String s = input.nextLine();
            
            char[] c = s.toCharArray();
            
            for (int j = c.length-1; j >=0; j--) {
                System.out.print(c[j]);
                
                
            }
           
            
                System.out.println();
           
        }
    }
    
}
