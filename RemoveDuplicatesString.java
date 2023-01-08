package Recursion;
import java.lang.ref.SoftReference;
import java.util.*;

public class RemoveDuplicatesString {
   // static
    static String removeDuplicates(String s,int i,String ans){

        if(i==s.length()){
            return ans;
        }
        if(!(ans.contains(String.valueOf(s.charAt(i))))){
            ans=ans.concat(String.valueOf(s.charAt(i)));
        }
        return removeDuplicates(s,i+1,ans);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        String st=removeDuplicates(s,0,ans);
        System.out.println(st);
    }
}
