import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int result_A = 0;
        int result_B = 0;

        if (A < B){
            result_A = 1;
        }

        if (A == B){
            result_B = 1;
        }

        System.out.printf("%s %s", result_A, result_B);
    }
}