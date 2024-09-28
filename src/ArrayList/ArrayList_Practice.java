package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Practice {

    public static int find_Max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        return max;
    }

    public static void swapTwoNumbers(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        //add()  ----O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //get()  --O(1)
        // System.out.println(list);
        // System.out.println(list.get(2));

        //remove() -- O(n)

        // list.remove(2);
        // System.out.println(list);

        
        //set()  --O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // //contains()  --O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));


        // //add(index, element)  --O(n)
        // list.add(2,15);
        // System.out.println(list);


        //size() 

        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }

        //print reverse
        // System.out.println();
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+" ");
        // }


        // System.out.println(find_Max(list));


        // swapTwoNumbers(list, 0, 1);
        // System.out.println(list);

        //Sorting in ArrayList 
        list.set(0, 10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //Sorting in reverseOrder
        Collections.sort(list, Collections.reverseOrder());
        //second parameter is called
        //comparator - it is a function that defines sorting logic
        System.out.println(list);


    }
}
