//Program to print *

import java.io.*;
import java.util.*;

public class asign3 {
    public static void main(String[] args){  

        int n;
        Scanner sc = new Scanner(System.in);  
    
        System.out.print("Enter the number : ");
        n = sc.nextInt();

        for (int i = 0; i<= n-1; i++){  
            for (int j = 0; j <= i; j++){  
                System.out.print("* ");  
            }   
            System.out.println("");   
        }

        for (int i = n-1; i >= 0; i--){  
            for(int j = 0; j <= i-1; j++){  
                System.out.print("* ");
            }  
            System.out.println("");  
        }  
                
    }
}
