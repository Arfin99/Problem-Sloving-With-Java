package JavaDimikOJProblems;

import java.util.Scanner;

public class JavaProblem14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line1 = input.nextInt();

        for (int i = 0; i < line1; i++) {
            input.nextLine();
            String s = input.nextLine();
            String c = input.next();
            int count = 0;

            char[] s1 = s.toCharArray();
            char[] c1 = c.toCharArray();

            for (int j = 0; j < s1.length; j++) {
                if (c1[0]==s1[j]) {
                    count++;
                }
            }

            if (count !=0) {
                System.out.println("Occurrence of '" + c + "' in '" + s + "' = " + count);
            }
            else if(count ==0){
                
                System.out.println("'" + c + "' is not present");
            }

        }

    }

}
