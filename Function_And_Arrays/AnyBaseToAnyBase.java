package Function_And_Arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dig = anyBaseToAnyBase(n,b1,b2);
        System.out.println(dig);
    }

    public static int anyBaseToAnyBase(int n,int b1,int b2){
        int dV = anyBaseToDecimal(n, b1); //Converting to decimal
        int fV = decimalToAnyBase(dV, b2); // Converting to destination base
        return fV;
    }
    public static int anyBaseToDecimal(int n,int b){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            rv = rv + p * rem;
            p = p * b;
        }
        return rv;
    }
    public static int decimalToAnyBase(int n,int b){
        int rv = 0;
        int p = 1;
        while(n>0){
            int rem = n % b;
            n = n / b;
            rv = rv + p * rem;
            p = p * 10;
        }
        return rv;
    }




}
