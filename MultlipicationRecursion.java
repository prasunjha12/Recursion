package Recursion;
import java.util.*;

public class MultlipicationRecursion {

    //static int i=0;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mult=recursive_multiply(a,b);
        System.out.println("Multiplication of "+a+" and  "+b+" yeilds: "+mult);
    }

    private static int recursive_multiply(int a, int b) {

        if(b<=0)
            return 0;
        return a+recursive_multiply(a,b-1);
    }
}
