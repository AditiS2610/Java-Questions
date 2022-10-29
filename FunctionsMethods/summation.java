import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = in.nextInt();
        System.out.println("Enter 2nd number:");
        int b = in.nextInt();

        in.close();
        int sum = a + b;
        System.out.println("The sum is:" +sum);
    }
}
