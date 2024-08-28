package Bit_Manipulation;
import Bit_Manipulation.*;
public class Update_ith_Bit {
    public static int  update_ith_Bit(int num, int i, int newBit){
        Clear_Ith_Bit a = new Clear_Ith_Bit();
        Set_Ith_Bit b = new Set_Ith_Bit();
        // if(num == 0){
        //     return a.clear_Ith_Bit(num, i);
        // }
        // else{
        //     return b.set_Ith_Bit(num, i);
        // }

        num = Clear_Ith_Bit.clear_Ith_Bit(num, i);
        int bitMask = newBit<<i;
        return num | bitMask;

        


    }
public static void main(String[] args) {
  System.out.println(update_ith_Bit(3, 2, 1));
}
}
