package String.assignment;


import java.util.Arrays;
import java.util.Scanner;

public class Find_No_Of_Lowercase_Letter {

    /*  Question1:Count how many times lowercase vowels occurred in a String entered by the user */
    public static void find_No_Of_Lowercase_Letter(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }


    //Question 4
    public static boolean checkAnagram(String str1, String str2){
        //Remove white spaces
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if(str1.length() != str2.length()){
            return false;
        }
        else{
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for(int i=0; i<ch1.length; i++){
                if(ch1[i] != ch2[i]){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        // String str = new String("Hi I am Mohammed Afif");
        // find_No_Of_Lowercase_Letter(str);



        /* Question 2: What will be the output of the following code?  */

        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));


        /* Question 3: What will be the output of the following code? */

        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);


    
        /*  Question 4 :Determine if 2 Strings are anagrams of each other. 
        What are anagrams? If two strings contain the same characters but in a different order, 
        they can be said to be anagrams. Consider race and care. 
        In this case, race's characters can be formed into a study, or care's 
        characters can be formed into race. Below is a java program to check if two strings are 
        anagrams or not. */
        

        Scanner in = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();

        System.out.println("Enter String1: ");
        str1 = in.nextLine();

        System.out.println("Enter String2: ");
        str2 = in.nextLine();

        if(checkAnagram(str1.toLowerCase(), str2.toLowerCase())){
            System.out.println(str1+" is a anagram of "+str2);
        }
        else{
            System.out.println(str1+" is not a anagram of "+str2);
        }
    }

}
