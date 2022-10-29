import java.util.Scanner;
import java.lang.Math;

public class print {
    public static void main(String[] args) {
        int i,n, m = 0, flag= 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = in.nextInt();
        m = n/2;
        if (n==0||n==1){
            System.out.println("Not Prime");
        }else {
            for (i=2;i<m;i++){
                if (n%i==0){
                    System.out.println("not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("prime");
            }
        }
    }
}

