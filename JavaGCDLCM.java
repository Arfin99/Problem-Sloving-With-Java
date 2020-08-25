
import java.util.Scanner;


public class JavaGCDLCM {
    
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        long line = input.nextInt();
        
        for (long i = 0; i < line; i++) {
            
            long number1 = input.nextInt();
            long number2 = input.nextInt();
            
            long temp1 = number1;
            long temp2 = number2;
            long r,gcd,lcm;
            
            while(temp2 !=0)
            {
                r = temp1%temp2;
                temp1 = temp2;
                temp2= r;
            }
            
            gcd = temp1;
            
            lcm = (number1*number2)/gcd;
            System.out.println("LCM = "+lcm);
            
            
        }
        
    }
    
}
