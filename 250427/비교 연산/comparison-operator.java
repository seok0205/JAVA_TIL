import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if (A >= B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
        if (A > B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        if (A <= B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        if (A < B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        if (A == B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        if (A != B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}