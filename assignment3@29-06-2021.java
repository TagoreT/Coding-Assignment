//To print no.of Even digits & Odd digits for a given number
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ass5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        int i=0;
        int en = 0, on = 0;

        System.out.println("Enter a number");
        n = sc.nextInt();

        while(n > 0){
            i = n%10;
            if(i%2 == 0){
                en = (en*10) + i;
            }
            else{
                on = (on*10) + i;
            }
            n = n/10;
        }

        int re = 0;
        while(en != 0) {
            int digit = en % 10;
            re = re * 10 + digit;
            en /= 10;
        }
        int ro = 0;
        while(on != 0) {
            int digit = on % 10;
            ro = ro * 10 + digit;
            on /= 10;
          }


        System.out.println("Even digits = " + re);
        System.out.println("Odd digits = " + ro);

    }
}
