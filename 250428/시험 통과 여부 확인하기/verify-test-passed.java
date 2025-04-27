import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        if (N >= 80){
            System.out.println("pass");
        }
        else {
            System.out.printf("%s more score", 80 - N);
        }
    }
}