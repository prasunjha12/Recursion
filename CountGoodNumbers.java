package Recursion;
import java.util.*;

public class CountGoodNumbers {
   static int mod=(int)1e9+7;
    static int countGoodNum(int n){

     return pow(4,n/2)*pow(5,n/2+n%2)%mod;
    }
    static int pow(long a,long b){

        if(b==0){
            return 1;
        }
        int ans=pow(a,b/2);

        if(b%2==0){
            return (ans * ans) % mod;
        }
        else{
            return (int)(a*ans*ans)%mod;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer :");
        int n=sc.nextInt();
        int p=countGoodNum(n);
        System.out.println(p);

    }
}
