import java.util.Scanner;

public class AllNumberTo1000EndedSeven {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if(i%10==7){
                System.out.println(i);
            }
        }
    }
}
