class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        Deque<Integer> dq = new ArrayDeque<Integer>();

        int result[] = new int[temp.length];

        int ans = 0;

        for(int i = temp.length - 1; i >= 0; i--) {

            while(!dq.isEmpty() &&  temp[i] >= temp[dq.peekFirst()]) {

                   dq.pop();

            }
            

            result[i] = dq.isEmpty() ? 0 : dq.peekFirst() - i;

            dq.push(i);
        }

        return result;

    }
}
