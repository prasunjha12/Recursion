package Recursion;

import java.util.ArrayList;

public class Subsequence {



    public static void main(String[] args) {
        int index=0;
        ArrayList<Integer> path=new ArrayList<>();
        ArrayList<Integer> ar=new ArrayList<>();
        int[] arr={3,1,2};
        printSubsequences(arr,index, path);
    }


    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path)
        {

            // Print the subsequence when reach
            // the leaf of recursion tree
            if (index == arr.length)
            {

                // Condition to avoid printing
                // empty subsequence
               // if (path.size() > 0)
                    System.out.println(path);
            }

            else
            {

                // Subsequence without including
                // the element at current index
                printSubsequences(arr, index + 1, path);

                path.add(arr[index]);

                // Subsequence including the element
                // at current index
                printSubsequences(arr, index + 1, path);

                // Backtrack to remove the recently
                // inserted element
                path.remove(path.size() - 1);
            }
            return;
        }
    }

