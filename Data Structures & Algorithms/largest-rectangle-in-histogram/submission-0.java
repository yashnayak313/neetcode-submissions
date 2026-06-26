class Solution {
    public int largestRectangleArea(int[] heights) {
          
          int largest = 0;
          int n = heights.length;
            for (int i = 0; i < n; i++) {
                // left mein jao jab tak chhoti na mile
                int left = i;
                while (left > 0 && heights[left - 1] >= heights[i]) left--;
                
                // right mein jao jab tak chhoti na mile
                int right = i;
                while (right < n - 1 && heights[right + 1] >= heights[i]) right++;
                
                int width = right - left + 1;
                largest = Math.max(largest, heights[i] * width);
            }

            return largest;

    }
}
