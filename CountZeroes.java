package Recursion;
import  java.util.*;


public class CountZeroes {

    static int cout=0;
    static void countZeroes(int n){

        if(n==0){
            return;
        }
        if(n%10==0){
            cout+=1;
        }
        countZeroes(n/10);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        countZeroes(n);
        System.out.println(cout);

    }
}
