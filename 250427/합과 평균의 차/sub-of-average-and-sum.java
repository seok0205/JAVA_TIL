import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = (a+b+c) / 3;

        System.out.println(a + b + c);
        System.out.println(avg);
        System.out.println(a + b + c - avg);
    }
}