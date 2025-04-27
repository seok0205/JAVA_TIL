import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        if (N < 0){
            System.out.printf("%s\nminus", N);
        }
        else{
            System.out.printf("%s", N);
        }
    }
}