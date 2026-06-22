class Solution {

    public String encode(List<String> strs) {

            StringBuilder enc_str = new StringBuilder();
            for(String s : strs) {
                int len = s.length();

                enc_str.append(len).append("#").append(s);


            }

            return enc_str.toString();

    }

    public List<String> decode(String str) {


        ArrayList<String> str_arr = new ArrayList<>();
        int len = 0;
        int i = 0;
       while(i < str.length()) {
            String num = "";
            while(str.charAt(i) != '#' && i < str.length()) {
                num += str.charAt(i);
                i++;
            }

            int n = Integer.parseInt(num);

            String ans = str.substring(i + 1, i + n + 1);

            str_arr.add(ans);

            i = i + n + 1;

            
        }

        return str_arr;

    }
}
