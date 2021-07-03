//Program to print Automorphic

import java.io.*;
import java.util.*;

public class asign3 {
    public static void main(String[] args){  

        int n, sqr, temp, r, count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : \n");
        
        n = sc.nextInt();
        temp=n;        

        while (temp > 0)
        {
            temp=temp/10;
            count++;
        }

        sqr = n * n;
        r = sqr%(int)Math.pow(10, count);

        if(r == n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
                
    }
}
