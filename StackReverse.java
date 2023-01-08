package Recursion;
import java.util.*;

public class StackReverse {

    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
    }

}


//import java.io.*;

class GFG {
    static int getNoOfWays(int n)
    {

        // Base case
        if (n <= 2) {
            return n;
        }
        return getNoOfWays(n - 1) + getNoOfWays(n - 2);
    }

    // Driver Function
    public static void main(String[] args)
    {
        System.out.println(getNoOfWays(4));
        System.out.println(getNoOfWays(3));
    }
}
