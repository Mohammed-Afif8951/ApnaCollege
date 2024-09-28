package Backtracking;

public class Find_Substring {

    public static void find_Substring(String str, String s2,int i){

        if(i == str.length()){
            if(s2.length() == 0){
                System.out.println("NUll");
            }
            else{
                System.out.println(s2);
            }            
            return;
        }
        //kaam
        //choice 1 : Yes
        find_Substring(str, s2+str.charAt(i), i+1);

        //choice 2 : No
        find_Substring(str, s2, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        find_Substring(str, "", 0);

    }
}
