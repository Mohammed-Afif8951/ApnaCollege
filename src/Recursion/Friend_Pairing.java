package Recursion;

public class Friend_Pairing {

    public static int friend_Pairing(int n){
        //Base Case
        if(n == 1 || n == 2){
            return n;
        }
        //Kaam
        int fnm1 = friend_Pairing(n-1);

        int fnm2 = friend_Pairing(n-2);
        int pairways = (n-1) * fnm2;

        return fnm1 + pairways;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(friend_Pairing(n));
    }
}
