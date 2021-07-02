//Program to print number of Prime numbers in the range

import java.io.*;
import java.util.*;

public class asign1 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);      

        int a, b;
        int pCount = 0;

        System.out.print("Enter two number :\n");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b ; i++)
        {
            int dCount = 0;

            for(int j = 1; j <= i; j++){
                if(i % j == 0)
                    dCount++;
            } 

            if(dCount == 2)
                    pCount++;

        }
        System.out.println("Number of prime numbers : " + pCount );
    }
}
