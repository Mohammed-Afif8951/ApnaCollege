package Array2D;

public class StairCaseSearch {

    public static boolean stairCaseSearch_UpToDown(int arr[][],int key){
        int i=0; 
        int j= arr.length-1;
        while(i < arr.length && j >= 0){
            if(key == arr[i][j]){
                System.out.println(key+" is found at index: ("+i+","+j+")");
                return true;
            }
            else if(key > arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(key+" is not found");
        return false;
    }
    

    public static boolean stairCaseSearch_DownToUp(int arr[][],int key){
        int j=0; 
        int i= arr.length-1;
        while(j < arr.length && i >= 0){
            if(key == arr[i][j]){
                System.out.println(key+" is found at index: ("+i+","+j+")");
                return true;
            }
            else if(key > arr[i][j]){
                j++;
            }
            else{
                i--;
            }
        }
        System.out.println(key+" is not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { {1 , 2,  3,  4},
                        {5,  6,  7,  8},
                        {9, 10, 11, 12},
                        {13,14, 15, 16}};
        boolean ans =  stairCaseSearch_UpToDown(arr, 4);
   
    }
}

// time complexity = O(n+m)