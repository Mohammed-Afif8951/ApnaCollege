/*
 we are given a string S, we need to find the count of all contiguous substrings starting and
 ending with the same character.

 Sample Input 1: S = "abcab"
 Sample Output 1: 7

 There are 15 substrings of "abcab": a, ab, abc, abca, abcab,b,bc,bca,bcab,c,ca,cab,a,ab,b
 Out of the above substrings, there are 7 substrings: a,abca,b,bcab,c,a and b.
 So, only contiguous substrings start and end with same character.


 Sample Input 2: S = "aba"
 Sample Output 2: 4
 The substrings are a, b, a and aba.
 */
package Recursion.assignment;

public class Find_Substring_WithSameStartAndEnd {

    static int count;

    public static void find_Contiguous_Substrings(String str,int start, int end){

      if(str.length() == 0){
        System.out.println("The number of contiguous Substring are: "+count);
        return; 
      }

      if(str.charAt(start) == str.charAt(end)){
        System.out.println(str.substring(start, end+1));
        count++;
      }

      //kaam
      if(end < str.length()-1){
          find_Contiguous_Substrings(str, start,end+1);
      }
      else{
          str = str.substring(1);
          find_Contiguous_Substrings(str, 0, 0);
      }  
   }

 

   public static int find_No_Of_Contiguous_Substring(String str, int i, int j, int n){
    if(n == 1){
        return 1;
    }
    if(n <= 0){
        return 0;
    }
 
    int res = find_No_Of_Contiguous_Substring(str, i+1, j, n-1)+
            find_No_Of_Contiguous_Substring(str, i, j-1, n-1)-
            find_No_Of_Contiguous_Substring(str, i+1, j-1, n-2);

    if (str.charAt(i) == str.charAt(j)) {
        res++;
    }
    return res;
   }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
       // find_Contiguous_Substrings(str, 0, 0);
    System.out.println(find_No_Of_Contiguous_Substring(str, 0, n-1, n));
    }
}
