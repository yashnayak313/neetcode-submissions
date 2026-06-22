class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( 
            (a,b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        int a[] = new int[k];
        int i = 0;
        while(k > 0) {
            a[i] = pq.poll();
            i++;
            k--;
        }

        return a;



    }
}
