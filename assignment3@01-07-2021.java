//Program to print alphabets

import java.io.*;
import java.util.*;

public class asign2 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);      

        int n;
        int a = 65;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        for (int i = 0; i <= n ; i++)
        {  
            for (int j = 0; j <= i; j++)  
            {
                System.out.print((char) (a++) + " ");
            }  

            System.out.println();  
        }  
    }
}
