//Program to find the substraction of product and sum of a given number

import java.io.*;
import java.util.*;

public class asign8 {
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);      

        int n, pro = 1, sum = 0, r, re = 0;

        System.out.print("Enter a number : ");
        n = sc.nextInt();
                
        while(n > 0){
            r = n%10;            
                    
            sum += r;            
                    
            pro *= r;            
                    
            n = n/10;
        }        
        re = pro - sum;

        System.out.println(re);
                
    }
}
