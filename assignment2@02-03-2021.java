//Program to print Biggest of 16 numbers

import java.io.*;
import java.util.*;

public class asign2 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);      

        System.out.print("Enter a number 16 numbers: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();

        int b1 = (int) Math.max(Math.max(a,b), Math.max(c,d));
        int b2 = (int) Math.max(Math.max(e,f), Math.max(g,h));
        int b3 = (int) Math.max(Math.max(i,j), Math.max(k,l));
        int b4 = (int) Math.max(Math.max(m,n), Math.max(o,p));

        int b5 = (int) Math.max(Math.max(b1,b2), Math.max(b3,b4));

        System.out.println("Biggest number : "+ b5);


    }
}
