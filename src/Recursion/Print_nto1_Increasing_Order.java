package Recursion;

public class Print_nto1_Increasing_Order {

    public static void printInc(int n){
        
        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
