package Patterns;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1;i<=10;i++)
        {
            int t = n*i;
            System.out.println(n + " * " + i + " = " + t );
        }

    }
}
