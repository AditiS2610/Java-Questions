package Function_And_Arrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        int p = 1;
        int rv = 0;
        while(n>0)
        {
            int rem = n%b;
            n = n/b;
            rv = rv + p * rem;
            p = p * 10;
        }
        return rv;
    }
}
