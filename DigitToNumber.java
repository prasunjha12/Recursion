package Recursion;
import java.util.*;

public class DigitToNumber {
    static int i=0;
    static String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    static void digToNum(int n){
        if(n==0){
            return;
        }

        digToNum(n/10);
        System.out.print(arr[n%10]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        digToNum(n);
    }
}
