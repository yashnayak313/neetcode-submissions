class Solution {
    public String minWindow(String s, String t) {


        HashMap<Character, Integer> m1 = new HashMap<>();

        HashMap<Character, Integer> m2 = new HashMap<>();

        if(t.length() > s.length()) {
            return "";
        }



        for(int i = 0; i < t.length(); i++) {

            if(!m1.containsKey(t.charAt(i))) {

                    m1.put(t.charAt(i),1);
            }
            m1.put(t.charAt(i), m1.get(t.charAt(i))+1);
        }

        int need = t.length();
        
        int have = 0;

        int left = 0;

        String ans = "";

        for(int i = 0; i < s.length(); i++) {
            
            
                if(!m2.containsKey(s.charAt(i))) {

                        m2.put(s.charAt(i),1);
                }
                m2.put(s.charAt(i), m2.get(s.charAt(i))+1);


            if(m1.containsKey(s.charAt(i)) &&(m1.get(s.charAt(i)) >= m2.get(s.charAt(i)))) {
                

                have++;
            }

            if(have == need) {

                boolean isValid = true;
                
                while(isValid == true && left < s.length()) {

                    if(!m1.containsKey(s.charAt(left))) {
                        left++;
                    }

                    else if(m1.containsKey(s.charAt(left)) && m2.get(s.charAt(left)) > m1.get(s.charAt(left))) {
                       
                       char toRemove = s.charAt(left);
                        left++;
                        m2.put(toRemove, m2.get(toRemove) - 1);
                    }
                    else {
                        isValid = false;
                    }

                }
               if(ans.isEmpty() || (i - left + 1) < ans.length()) {
                    ans = s.substring(left, i + 1);
                }

            }

        }
        
        return ans;
    }
}
