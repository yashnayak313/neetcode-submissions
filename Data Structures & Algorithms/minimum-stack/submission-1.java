class MinStack {

    private Deque<Integer> st;

    private Deque<Integer> minSt;

    public MinStack() {
        
        st = new ArrayDeque<Integer>();

        minSt = new ArrayDeque<Integer>();

    }
    
    public void push(int x) {

     

        if(minSt.isEmpty() || x <= minSt.peek()) {
            minSt.push(x);
        }
        else {
            minSt.push(minSt.peek());
        }
        st.push(x);
        
    }
    
    public void pop() {

        st.pop();
        minSt.pop();
        
    }
    
    public int top() {

        return st.isEmpty() ? -1 : st.peek();
        
    }
    
    public int getMin() {

        return minSt.isEmpty() ? -1 : minSt.peekFirst();
        
    }
}
