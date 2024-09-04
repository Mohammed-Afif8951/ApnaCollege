package Recursion.assignment;

public class Tower_Of_Hanoi {

    public static void tower_Of_Hanoi(int n, String src, String helper, String destination){

        if(n == 1){
            System.out.println("Transfer disks "+ n +" from "+ src +" to "+ destination); 
            return;
        }
        //kaam
        //Step 1 transfer (n-1) blocks from src to the helper
        tower_Of_Hanoi(n-1, src, destination, helper);
        System.out.println("Transfer disks "+ n +" from "+ src +" to "+ destination);

        //step 3 transfer (n-1) disks from helper to destination
        tower_Of_Hanoi(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        tower_Of_Hanoi(n,"S","H","D");
        
    }
}
