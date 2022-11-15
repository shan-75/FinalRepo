import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();

        // performing arithmetic operations

        int sum = a + b;
        int diff = Math.abs(a -b);
        int product = a*b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);

    }
}
