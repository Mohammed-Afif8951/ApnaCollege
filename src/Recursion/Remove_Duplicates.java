package Recursion;

public class Remove_Duplicates {

    public static void remove_Duplicates(String str, int indx, StringBuilder sb, boolean map[]){
        //BC
        if(indx == str.length()){
            System.out.println(sb);
            return;
        }
        //Kaam
        char curChar = str.charAt(indx);
        if(map[curChar - 'a'] == true){
            remove_Duplicates(str, indx+1, sb, map);
        }
        else{
            map[curChar - 'a'] = true;
            remove_Duplicates(str, indx+1, sb.append(curChar), map);
        }

        
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        remove_Duplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
