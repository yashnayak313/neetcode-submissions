class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {

            char[] c = s.toCharArray();

            int a[] = new int[26];

            for(char ch : c) {
                a[ch - 'a']++;
            }

            StringBuilder str = new StringBuilder();

            for(int i : a) {
                str.append('#').append(i);
            }

            String key = str.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());

    }
}
