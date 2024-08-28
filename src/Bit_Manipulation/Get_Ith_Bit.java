package Bit_Manipulation;

public class Get_Ith_Bit {

    public static int  get_Ith_Bit(int n,int i){
        int bitmask  = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get_Ith_Bit(0001111, 3));
    }
}
