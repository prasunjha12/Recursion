package Recursion;

import java.util.Scanner;

public class LinearSearchRecursively {

    //Recursive linear search
    static int linearSearch(int[] arr,int ele,int index){

        if(arr[index]==ele){
            return index;
        }
        if(index==(arr.length-1)){
            return  -1;
        }

        return linearSearch(arr,ele,++index);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int ele=sc.nextInt();
        int pos=linearSearch(arr,ele,0);
        System.out.println("Position of searched element :"+pos);
    }
}
