package Arrays;



public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchS(String arr[], String key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {1,3,5,10,5,9,20};
        // int index = linearSearch(arr, 10);

        String arr[] = {"Afif", "Shaarif","Mafaaz","Suhail"};
        int index = linearSearchS(arr,"Mafaaz");
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Index is at "+index);
        }
    }

}
