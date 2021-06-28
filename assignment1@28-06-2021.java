//Program to print range of even numbers in reverse order using Wile loop.
import java.util.Scanner;

public class ass1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n,m;

        System.out.println("Enter two numbers ");
        n = sc.nextInt();
        m = sc.nextInt();

        while(m >= n){
            if(m %2 == 0)
                System.out.print(m + " " );
            m--;
        }

    }
}
