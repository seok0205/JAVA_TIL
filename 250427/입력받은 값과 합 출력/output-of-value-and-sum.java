import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        System.out.printf("%s %s %s", A, B, (A+B));
    }
}