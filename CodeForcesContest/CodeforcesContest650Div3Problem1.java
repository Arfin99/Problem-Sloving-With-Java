
package CodeForcesContest;

import java.util.Scanner;

public class CodeforcesContest650Div3Problem1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
        input.nextLine();
        for (int i = 0; i < testCase; i++) {
            
            String b = input.nextLine();
            char[] aString = new char[b.length()];
            
            char[] bString = b.toCharArray();
            
            if(b.length() ==2){
                System.out.println(b);
            }
            
            else if(b.length() >3){
                aString[0]=bString[0];
                aString[1]=bString[1];
                int k=2;
                for (int j = 3; j < b.length(); j++) {
                    if(j%2 !=0){
                        aString[k++]=bString[j];
                    }
                }
               
               for (int j = 0; j < aString.length; j++) {
                   if(aString[j] !='\u0000'){
                       System.out.print(aString[j]);
                   } 
                   
                    
               }
               System.out.println();
                
            }
            
        }

    }
    
}
