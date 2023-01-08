package Recursion;
import java.util.*;

public class LengthString {

    static int lengthString(String s,int i){

        if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){

            return 0;
        }
      return 1+lengthString(s,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;
        int ans=lengthString(s,i);
        System.out.println("Length ="+ans);
    }
}
