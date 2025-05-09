import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int[] numbers = new int[10];

        numbers[0] = a;
        numbers[1] = b;

        for (int i=2; i<10; i++){
            numbers[i] = (numbers[i-1] + numbers[i-2]) % 10;
        }

        for (int i=0; i<10; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}