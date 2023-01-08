package Recursion;
import java.util.*;

public class OccurArrayKey {
    static void printIndex(int[] arr,int key,int i){

        if(i==arr.length)
            return;
        if(arr[i]==key)
            System.out.print(i+" ");
        printIndex(arr,key,i+1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        System.out.println("Enter the key whose indexes you want to retrieve");
        int key=sc.nextInt();
        printIndex(arr,key,i);
    }
}
