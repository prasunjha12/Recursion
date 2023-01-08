package Recursion;

public class PatternProblems {

//    static void printPatten(int n){
//
//        if(n==0){
//            return;
//        }
//
//        int i=0;
//        while(i<n){
//            System.out.print("* ");
//            ++i;
//        }
//
//        System.out.println();
//        printPatten(--n);
//    }

    //Inverse Pascal triangle

//    static void printPatten(int r,int c){
//
//        if(r==0){
//            return;
//        }
//        if(c==r){
//            System.out.println();
//            printPatten(--r,0);
//        }
//        else{
//            System.out.print("* ");
//            printPatten(r,++c);
//        }
//    }

       //Pascals Traingle
        static void printPatten(int r,int c){

        if(r==0){
            return;
        }
        if(c==r){

            printPatten(--r,0);
            System.out.println();
        }
        else{

            printPatten(r,++c);
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {

        int n=7;
        printPatten(n,0);

    }
}
