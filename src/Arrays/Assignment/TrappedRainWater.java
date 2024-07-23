package Arrays.Assignment;

public class TrappedRainWater {
    //Trapped rain water = (water level - height of block)* width of the block

    //water level = min(left max height of block ,  right max height of block)
    //water level = min(leftMax , rightMax)

    public static int trappedRainWater(int height[]){
        int n = height.length;
        int trappedWater = 0;
        int width = 1;
        //leftmax - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //rightMax - Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]) * width;
        }

        return trappedWater;
}

    public static void main(String[] args) {
        //int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height[] = {4,2,0,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
