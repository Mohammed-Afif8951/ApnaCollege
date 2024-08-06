/*
    1)given String = "aaabbcd"
    output = "a3b2cd"

    2)given String = "bbbaaccc"
    output = "b3a2c3"
 */
package String;
public class StringCompression {

    public static void stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = new String("aaabcc");
        stringCompression(str);
    }
}
