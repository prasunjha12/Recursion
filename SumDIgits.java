package Recursion;
import java.util.*;

public class SumDIgits {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=digitsProduct(n);
        System.out.println(sum);
    }

    static int digitsProduct(int n){

        if(n==0) {
            return 1 ;
        }
        return (n%10)*digitsProduct(n/10);
    }
}
