class Solution {
    public int trap(int[] height) {
        
        int[] leftMaxHeight = new int[height.length];

        int[] rightMaxHeight = new int[height.length];

        int leftMax = Integer.MIN_VALUE;

        int rightMax = Integer.MIN_VALUE;

        for(int i = 0;i < height.length; i++) {

            leftMaxHeight[i] = Math.max(leftMax, height[i]);

            leftMax = Math.max(leftMax, height[i]);


        }

        for(int j = height.length - 1; j >= 0; j--) {

            rightMaxHeight[j] = Math.max(rightMax, height[j]);

            rightMax = Math.max(rightMax, height[j]);
        }

        int total = 0;
        for(int i = 0; i < height.length; i++) {

            total += Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i];

        }


        return total;

    }
}
