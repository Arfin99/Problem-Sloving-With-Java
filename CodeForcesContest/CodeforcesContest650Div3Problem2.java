package CodeForcesContest;

import java.util.Scanner;

public class CodeforcesContest650Div3Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        

        for (int i = 0; i < testCase; i++) {
           int count = 0;
            int elementSize = input.nextInt();

            int[] arr = new int[elementSize];
            for (int j = 0; j < elementSize; j++) {
                arr[j] = input.nextInt();
            }
            
            if(arr.length ==1){
                if(arr[0] % 2 ==0){
                    count =0;
                }
                
                else{
                    count = -1;
                }
            }
            
            else{
               for (int j = 0; j < elementSize; j = j + 2) {

                if (j % 2 != arr[j] % 2) {
                    int k = j+1;
                    while(k<elementSize){
                         if (k % 2 != arr[k] % 2) {
                            int temp = arr[j];
                            arr[j] = arr[k];
                            arr[k] = temp;
                            k=k+2;
                            count++;
                            break;
                    }
                   
                       

                        }
                    
                }

            } 
            }
            

            System.out.println(count);
        }
    }
}
