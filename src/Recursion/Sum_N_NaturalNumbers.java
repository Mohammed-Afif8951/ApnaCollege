package Recursion;

public class Sum_N_NaturalNumbers {

    public static int sum_Of_NaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sum_Of_NaturalNumbers(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum_Of_NaturalNumbers(n));
    }
}
