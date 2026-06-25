class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> st = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '}' || ch == ']' || ch == ')') {

                    if(st.isEmpty()) {
                        return false;
                    }
                
                    if(ch == '}' && st.pop() != '{') {
                        return false;
                    }

                    else if(ch == ')' && st.pop() != '(') {
                        return  false;
                    }

                    else if(ch == ']' && st.pop() != '[') {
                        return false;
                    }
                

            }
            else {
                st.push(ch);
            }

        }

        return st.isEmpty();
    }
    
}