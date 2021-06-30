//Program to print change replace X to Y in N
import java.io.*;
import java.util.*;

public class ass6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n, x, y, s = 0, count = 1, r = 0;

        System.out.println("Enter a number");
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        while(n != 0){
            r = n%10;
            if(r == x){
                r = y;
            }
            s = r * count + s;
            count = count * 10;
            n = n/10;
        }

        System.out.print(s);
    }
}
