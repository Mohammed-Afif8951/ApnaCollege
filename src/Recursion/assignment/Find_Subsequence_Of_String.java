package Recursion.assignment;

public class Find_Subsequence_Of_String {

    public static void find_Subsequence_Of_String(String str, int indx, String newString){

        if(indx == str.length()){
            System.out.println(newString);
            return;
        }


        //kaam 
        char curChar = str.charAt(indx);
        //choice 1 - add the element to newString
        find_Subsequence_Of_String(str, indx+1, newString+curChar);

        // choice 2 - dont add the element to newString
        find_Subsequence_Of_String(str, indx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        find_Subsequence_Of_String(str, 0, "");
    }
}
