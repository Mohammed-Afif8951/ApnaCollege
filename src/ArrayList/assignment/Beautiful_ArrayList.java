package ArrayList.assignment;

import java.util.ArrayList;

public class Beautiful_ArrayList {

    public static ArrayList<Integer> beautiful_ArrayList1(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();

            //add  odd element in the arraylist 
            for(int i=0; i<ans.size(); i++){
                if((ans.get(i) * 2 -1) <= n){
                    temp.add(ans.get(i) * 2 -1);
                }
            }
            
            //add even element in the arraylist
            for(int i=0; i<ans.size(); i++){
                if(ans.get(i) * 2 <= n){
                    temp.add(ans.get(i) * 2);
                }
            }
            ans = temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;

        ArrayList<Integer> ans = beautiful_ArrayList1(n);
        System.out.println(ans);

    }
}
