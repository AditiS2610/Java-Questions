package Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = anyBaseToDecimal(n,b);
        System.out.print(dn);
    }

    public static int anyBaseToDecimal(int n , int b){
        int rv = 0;
        int p =1;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            rv = rv + p * rem;
            p = p * b;
        }
        return rv;
    }
}
