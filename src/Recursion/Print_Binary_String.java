package Recursion;

public class Print_Binary_String {

    public static void print_Binary_String(int n, int lastPlace, String str){
        // Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Kaam
        if(lastPlace == 0){
            //choice is 0
            print_Binary_String(n-1, 0, str+"0");

            //choice is 1
            print_Binary_String(n-1, 1, str+"1");
        }
        else{
            print_Binary_String(n-1, 0, str+"0");
        }

        // print_Binary_String(n-1, 0, str+"0");
        // if(lastPlace == 0){
        //     print_Binary_String(n-1, 1, str+"1");
        // }
         
         
    }
    public static void main(String[] args) {
        int n = 3;
        print_Binary_String(n, 0, "");
    }
}
