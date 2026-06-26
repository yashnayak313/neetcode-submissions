class Solution {
    public int largestRectangleArea(int[] heights) {
          
        int n = heights.length;

        Deque<Integer> dq = new ArrayDeque<Integer>();

        int largest = 0;
        for(int i = 0; i < heights.length; i++) {

                while(!dq.isEmpty() && heights[i] < heights[dq.peekFirst()]) {
                    int h = heights[dq.pop()];

                    int width = dq.isEmpty() ? i : i - dq.peekFirst() - 1;

                    largest = Math.max(largest, h * width);


                }

                dq.push(i);
        }

        while(!dq.isEmpty()) {
            int h = heights[dq.pop()];

            int width = dq.isEmpty() ? n : n - dq.peekFirst() - 1;

            largest = Math.max(largest, h * width);

        }

        return largest;

    }
}
