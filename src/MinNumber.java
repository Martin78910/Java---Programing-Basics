import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            int num = scanner.nextInt();
            if(num<min){
                min = num;

            }

        }
        System.out.println(min);
    }
}
