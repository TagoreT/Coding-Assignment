//To print no.of Even digits & Odd digits for a given number

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ass2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        int ec = 0;
        int oc = 0;
        int i=0;

        System.out.println("Enter a number");
        n = sc.nextInt();

        while(n > 0){
            i = n%10;
            if(i%2 == 0){
                ec++;
            }
            else{
                oc++;
            }
            n = n/10;
        }

        System.out.println("Odd digits = " + oc);
        System.out.println("Even digits = " + ec);

    }
}
