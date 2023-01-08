package Recursion;
import java.util.*;


public class RopeCutting {

    static int ropeCutting(int n,int a,int b,int c){

       if(n==0)
           return 0;
       if(n<0)
           return  -1;
     //  int res=Math.max(ropeCutting(n-a,a,b,c), Math.max(ropeCutting(n-b,a,b,c),ropeCutting(n-c,a,b,c)));

       int res=Collections.max(Arrays.asList(ropeCutting(n-a,a,b,c),ropeCutting(n-b,a,b,c),ropeCutting(n-c,a,b,c)));
       if(res==-1)return res;
          else
           return res+1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n ,a ,b ,c in sequential manner");
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=ropeCutting(n,a,b,c);
        System.out.println(ans);

    }
}
