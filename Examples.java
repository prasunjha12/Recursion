package Recursion;

//printing from n to 1

//public class Examples {
//
//    static void print(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        print(n);
//    }
//}

//printing from 1 to n

public class Examples {

    static void print(int n){
        if(n==0) {
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
