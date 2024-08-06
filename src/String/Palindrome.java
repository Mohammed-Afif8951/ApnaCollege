package String;

public class Palindrome {
    public static boolean checkPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(checkPalindrome("afif")){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
