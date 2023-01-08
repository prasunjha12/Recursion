package Recursion;
import java.util.*;

public class MaxEleInArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=MaxArray(arr,n-1);
        System.out.println("Maximum element in the given array is :"+max);
    }
    static int MaxArray(int[] arr,int n){

        if(n<=0

        ){
            return arr[0];
        }
        return Math.max(arr[n],MaxArray(arr,n-1));
    }
}



