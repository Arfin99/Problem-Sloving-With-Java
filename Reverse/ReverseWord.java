
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < line; i++) {
            
            String s = input.nextLine();
            
            String[] s1 = s.split(" ");
            
            for (int j = 0; j < s1.length; j++) {
                char[] c = s1[j].toCharArray();
                char[] c1 =new char[c.length];
                int index=0;
                for (int k =c.length-1; k>=0; k--) {
                    c1[index++]=c[k];
                }
                
                s1[j]=String.valueOf(c1);
                
            }
            
            for (int j = 0; j < s1.length; j++) {
                System.out.print(s1[j]);
                if(j !=s1.length-1)
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
