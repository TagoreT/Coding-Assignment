//Program to print *

import java.io.*;
import java.util.*;

public class asign1 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);      

        int n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        for (int i = n-1; i >= 0 ; i--)  
        {  
            for (int j = 0; j <=i ; j++) 
            {  
                System.out.print("* ");  
            }
            System.out.println();  
        }  
    }
}
