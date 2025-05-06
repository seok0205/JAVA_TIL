import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();
        String c = input.next();
        String d = input.next();
        String e = input.next();
        String f = input.next();
        String g = input.next();
        String h = input.next();
        String i = input.next();
        String j = input.next();

        String[] words = {a, b, c, d, e, f, g, h, i, j};

        for (int idx = words.length-1; idx > -1; idx--){
            System.out.print(words[idx]);
        }
    }
}