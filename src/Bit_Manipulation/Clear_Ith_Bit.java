package Bit_Manipulation;

public class Clear_Ith_Bit {

    public static int clear_Ith_Bit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }
    public static void main(String[] args) {
        System.out.println(clear_Ith_Bit(5,0));
    }
}
