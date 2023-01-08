package Recursion;
import java.util.*;

public class SubSetsString {

    //static int i=0,j=1;
//    static void printSubset(String s,int i,int j){
//
//        //recursive approach
//        if(j==s.length()+1){
//            i+=1;
//            j=i+1;
//        }
//        if(i==s.length()){
//            return;
//        }
//
//        System.out.println(s.substring(i,j));
//        printSubset(s,i,j+1);
//    }

    static void printSubset(String s,String curr,int i){

        if(i==s.length()){
            System.out.println(s);
            return;
        }
        printSubset(s,curr,i+1);
        printSubset(s,curr+String.valueOf(s.charAt(i)),i+1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String curr="";
        int i=0;

        //Iterative approach
//        for(int i=0;i<s.length();i++){
//
//            for(int j=i+1;j<=s.length();j++){
//
//                System.out.println(s.substring(i,j));
//            }
//        }
       printSubset(s,curr,i);
    }
}
