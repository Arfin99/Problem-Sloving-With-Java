
package Codeforces665div2;

import java.util.Scanner;

public class Codeforces665Problem1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testCase = in.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int step=0;
            int n = in.nextInt();
            int k = in.nextInt();
            
            if(n>k){
                if(n%2==0 && k%2==0){
                    step=0;
                }
                
                else if(n%2 !=0 && k%2 !=0){
                    step=0;
                }
                
                else{
                    step=1;
                }
            }
            
            else{
                step =k-n;
            }
            
            System.out.println(step);
            
        }
    }
    
}
