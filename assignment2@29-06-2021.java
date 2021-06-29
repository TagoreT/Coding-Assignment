//Program to print reverse of a given number

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int n;
        int r = 0;
        
        n = sc.nextInt();
       
        while(n != 0) {
    
            int re = n % 10;
            r = r * 10 + re;

            n /= 10;
        }
        System.out.println(r);
    }
}
