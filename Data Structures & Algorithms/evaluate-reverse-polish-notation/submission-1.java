class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++) {

            String ch = tokens[i];

            if(isValidNumYash(ch) == true) {
                dq.push(Integer.parseInt(ch));
            } 
            else {
                int a = dq.pop();
                int b = dq.pop();
                int ans = 0;

                switch(ch) {
                    case "+":
                         ans = b + a;
                         break;
                    case "-":
                        ans = b - a;
                        break;
                    case "*":
                        ans = b * a;
                        break;
                    default:
                        ans = b / a;
                        break;
                }
                dq.push(ans);
            }

        }

        return dq.peekFirst();

    }

    private static boolean isValidNumYash(String ch) {

        if(ch.equals("+") || ch.equals("-") || ch.equals("/")|| ch.equals("*")) {

                return false;
        }
        return true;
    }
}
