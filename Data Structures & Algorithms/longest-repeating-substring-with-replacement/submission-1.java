class Solution {
    public int characterReplacement(String s, int k) {
        
      
      int arr[] = new int[26];

      int maxLen = 0;

      int left = 0;

      int maxWindow = 0;

      for(int i = 0; i < s.length(); i++) {

        int windowS = i - left + 1;

          arr[s.charAt(i) - 'A']++;

          maxWindow = Math.max(maxWindow,arr[s.charAt(i) - 'A'] );

            if(windowS - maxWindow <= k) {

                maxLen = Math.max(maxLen, windowS);
            }

            else {
                arr[s.charAt(left) - 'A']--;
                left++;
            }

          


      }


        
        return maxLen;
    }
}
