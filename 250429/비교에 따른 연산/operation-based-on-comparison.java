import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b){
            System.out.println(a*b);
        }
        else{
            System.out.println(b/a);
        }
    }
}