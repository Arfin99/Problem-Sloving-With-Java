
package JavaDimikOJProblems;

import java.util.Scanner;

public class JavaProblem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        
        for (int i = 0; i <line; i++) {
            
             String string1= input.next();
             int[] count = new int[26];
        
        char[] stringArray = string1.toCharArray();
        
        for (int i1 = 0; i1< stringArray.length; i1++) {
            
            if(stringArray[i1]>='a' && stringArray[i1]<='z'){
               count[stringArray[i1]-'a']++;
            }
            
        }
        
        for(int j=0;j<count.length;j++){
            if(count[j] !=0){
                int number = j+97;
                char letter = (char)number;
                System.out.println(letter+" = "+count[j]);
            }
        }
        
        if(i!=line-1){
            System.out.println();
        }
        }
        
       
        
    }
    
}
