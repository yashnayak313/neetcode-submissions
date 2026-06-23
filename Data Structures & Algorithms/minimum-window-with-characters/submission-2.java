class Solution {
    public String minWindow(String s, String t) {


        HashMap<Character, Integer> m1 = new HashMap<>();

        HashMap<Character, Integer> m2 = new HashMap<>();


        for(char c : t.toCharArray()) {

            m1.put(c, m1.getOrDefault(c,0) + 1);
        }

        int need = m1.size();

        int resLen = Integer.MAX_VALUE;
        int left = 0;
        int leftChar = 0;
        int have = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch  = s.charAt(i);

            m2.put(ch, m2.getOrDefault(ch,0) + 1);

            if(m1.containsKey(ch) && m1.get(ch).equals(m2.get(ch))) {
                have++;
            }

            if(have == need) {

                while(have == need) {

                    if(resLen > i - left + 1) {
                        resLen = i - left + 1;
                        leftChar = left;
                    }

                    m2.put(s.charAt(left), m2.get(s.charAt(left)) - 1);

                    if(m1.containsKey(s.charAt(left)) && m2.get(s.charAt(left)) < m1.get(s.charAt(left))) {
                            
                            have--;
                    }
                    left++;
                }
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(leftChar,leftChar + resLen);

     
    }
}
