//Program to print *

import java.io.*;
import java.util.*;

public class asign2 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        
        int n, i, k, count = 1;

        System.out.println("Enter a number : ");
        
        n = sc.nextInt();        
        
        count = n - 1;
        for (k = 1; k <= n; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
              System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (k = 1; k <= n - 1; k++)
        {
            for (i = 1; i <= count; i++)
              System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (n - k) - 1; i++)
              System.out.print("*");
            System.out.println();
        }

    }
}
