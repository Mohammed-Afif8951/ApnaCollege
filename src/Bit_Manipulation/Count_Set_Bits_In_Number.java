package Bit_Manipulation;

public class Count_Set_Bits_In_Number {

    public static int count_Set_Bits_In_Number(int n){
        int count = 0;
        while (n>0) {
            if ((n&1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count_Set_Bits_In_Number(7));
    }
}
