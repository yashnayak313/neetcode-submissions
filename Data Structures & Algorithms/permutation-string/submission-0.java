class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) {
            return false;
        }

       int left = 0;


       int arr[] = new int[26];

       for(int i = 0; i < s1.length(); i++) {

            arr[s1.charAt(i) - 'a']++;
       }


       for(int right = 0; right < s2.length(); right++) {

                arr[s2.charAt(right) - 'a']--;

                if(right - left + 1 == s1.length()) {
                     
                     boolean isValid = true;
                     for(int i = 0; i < arr.length; i++) {
                        if(arr[i] != 0) {
                            isValid = false;
                        }
                     }

                     if(isValid == true) {
                        return true;
                     }

                     arr[s2.charAt(left) - 'a']++;
                     left++;

                } 

                
                

       }

        return false;
    }
}
