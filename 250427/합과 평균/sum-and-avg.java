import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        double avg = (A+B) / 2.0;
        System.out.printf((A+B) + " %.1f", avg);
    }
}