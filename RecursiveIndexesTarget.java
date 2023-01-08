package Recursion;

import java.util.ArrayList;

public class RecursiveIndexesTarget {
    static ArrayList<Integer> indexes(int[] arr,int t,int i){

        ArrayList<Integer> list=new ArrayList<>();

        if(i==arr.length){
            return list;
        }
        if(arr[i]==t){
            list.add(i);
        }
        ArrayList<Integer> ansFromLastCalls=indexes(arr,t,++i);

        list.addAll(ansFromLastCalls);

        return list;
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,4,7};

        ArrayList<Integer> var=indexes(arr,4,0);

        System.out.println(var);
    }
}
