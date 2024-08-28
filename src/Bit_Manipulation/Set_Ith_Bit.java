package Bit_Manipulation;

public class Set_Ith_Bit {

    public static int  set_Ith_Bit(int n,int i){
        int bitmask  = 1<<i;
        return (n | bitmask);
    }
    public static void main(String[] args) {
        System.out.println(set_Ith_Bit(7, 3));
    }
}
