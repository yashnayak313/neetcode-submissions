class Solution {
    public boolean isAnagram(String s, String t) {
           
           int arr[] = new int[26];

           boolean ans = true;

           for(int i = 0; i < s.length(); i++) {

                arr[s.charAt(i) - 'a']++;
           }

           for(int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
           }

           for(int i = 0; i < 26; i++) {
                if(arr[i] != 0) {
                    ans = false;
                    break;
                }
           }

           return ans;
 
    }
}
