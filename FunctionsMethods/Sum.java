import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        int sum = a+b;

        System.out.print("The sum is "+sum);
    }


}
