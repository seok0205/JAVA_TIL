import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if (0 > a){
            System.out.println("ice");
        }
        else if (100 <= a){
            System.out.println("vapor");
        }
        else{
            System.out.println("water");
        }
    }
}