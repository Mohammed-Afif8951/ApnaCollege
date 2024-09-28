package Backtracking;

public class Find_Permutations {

    public static void find_Permutations(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            // abcde => ab + de = abde
            String newStr = str.substring(0, i) + str.substring(i+1);
            find_Permutations(newStr, ans+curChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        find_Permutations(str, "");
      

    }
}
