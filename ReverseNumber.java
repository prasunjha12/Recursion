package Recursion;
import  java.util.*;

//kth largest digit from end
public class ReverseNumber {

    static void reverse(int n){

        if(n<=0){
            return;
        }

        System.out.print(n%10+"");
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n=5678;
        reverse(n);
    }
}

