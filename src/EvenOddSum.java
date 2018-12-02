import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the numbers: ");
        int oddSum =0;
        int evenSum=0;
        for (int i = 0; i <n ; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            if(i%2==0){
                evenSum+=element;
            }else{
                oddSum+=element;
                int difference = Math.abs(evenSum-oddSum);
                System.out.println("No, difference =" + difference);
            }


        }

    }
}


