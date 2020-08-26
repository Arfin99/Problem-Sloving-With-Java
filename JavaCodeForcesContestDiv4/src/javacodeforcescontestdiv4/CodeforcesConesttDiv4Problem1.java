
package javacodeforcescontestdiv4;

import java.util.Scanner;


public class CodeforcesConesttDiv4Problem1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        for (int i = 0; i < line; i++) {
            int number = input.nextInt();
            
            int count =0;
            int zero=0;
            
            
            String s1 = Integer.toString(number);
            char[] string1  =s1.toCharArray();
            int length1 = string1.length;
            for (int j = 0; j <length1; j++) {
                
                if(string1[j]=='0'){
                    zero++;
                }
            }
            
            int length2 = length1-zero;
            System.out.println(length2);
            
            
            
            for(int j=0;j<length1;j++)
            {
                count=0;
                if(string1[j]!='0')
                {
                    System.out.print(string1[j]);
                    while(count<length1-j-1)
                            {
                                System.out.print("0");
                                count++;
                            }
                    
                     System.out.print(" ");   
                    
                }
                  
                }
           
          
            System.out.println();
        }
    }
    
}
