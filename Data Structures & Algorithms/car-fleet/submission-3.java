class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        double car[][] = new double[position.length][2];
        Deque<Double> dq = new ArrayDeque<Double>();

        for(int i = 0; i < position.length; i++) {

            car[i][0] = position[i];
            double time = (double)(target - position[i]) / speed[i];
            car[i][1] = time;
        }

        Arrays.sort(car, (a,b) -> Double.compare(b[0],a[0]));

      
        for(int i = 0; i < car.length; i++) {

              if(dq.isEmpty() || car[i][1] > dq.peekFirst()) {
                    dq.push(car[i][1]);
              }
        }


        return dq.size();

    }
}
