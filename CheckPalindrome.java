package Recursion;
import java.util.*;
import java.lang.*;

public class CheckPalindrome {

    static int sum=0;

    //check Palindrome by recursion
    static boolean isPalindrome(int n){

        rev(n);
        return n == sum;
    }
    static void rev(int n){

        if(n<=0){
            return ;
        }
        sum=(sum*10)+(n%10);
        rev(n/10);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=isPalindrome(n);
        System.out.println(b);
    }



}








