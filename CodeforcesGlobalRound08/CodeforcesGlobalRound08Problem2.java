
package CodeforcesGlobalRound08;

import java.util.Scanner;


public class CodeforcesGlobalRound08Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int k= input.nextInt();
        
        String a = "codeforce";
        
        for(int i=0;i<k;i++){
            a = a+"s";
        }
        
        System.out.println(a);
        
    }
    
}
