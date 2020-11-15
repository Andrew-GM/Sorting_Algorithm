package sortingalg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingAlg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SortNum = 0;
        int Sum = 0;
        boolean HaveValue = false; 
        int TempStorage = 0;
        System.out.println("Choose 10 numbers to be sorted.\n[Press ENTER after each number]");
        int[] ToBeSorted = new int[10];
        for (int i = 0; i < 10; i++) {
            while(HaveValue==false){
                try{
                    System.out.println("Number "+(i+1) );
                    ToBeSorted[i] = input.nextInt();
                    HaveValue = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Enter a valid integer.");
                    input.next();
                }
            }
            HaveValue = false;
        }

        while (SortNum < 45) {
            for (int j = 0; j < 9; j++) {
                if (ToBeSorted[j] > ToBeSorted[j + 1]) {
                    TempStorage = ToBeSorted[j + 1];
                    ToBeSorted[j + 1] = ToBeSorted[j];
                    ToBeSorted[j] = TempStorage;
                }
            }
            SortNum = SortNum + 1;

        }
        System.out.println("");
        for (int x = 0; x < 10; x++) {
            if(x<9){
                System.out.print(ToBeSorted[x] + ", ");
                Sum = Sum + ToBeSorted[x];
            }else{
                System.out.print(ToBeSorted[x]+".\n");
                Sum = Sum + ToBeSorted[x];
            }

        }
        System.out.println("The average is " + (Sum / 10) + ".");
        System.out.println("The minimum is "+(ToBeSorted[0])+".");
        System.out.println("The maximum is "+(ToBeSorted[9])+".");
        System.out.println("The range is "+((ToBeSorted[9])-(ToBeSorted[0])+"."));
    }

}
