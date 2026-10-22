
class pq{
    int val;
    int min;
    pq(int val,int min){
        this.val=val;
        this.min=min;
    }
}
    class MinStack {
    Stack<pq>st=new Stack();

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(new pq(value,value));
            return;
        }
        pq num=st.peek();
        if(num.min<value){
             st.push(new pq(value,num.min));
        }else{
            st.push(new pq(value,value));
        }
        
    }
    
    public void pop() {

        st.pop();
    }
    
    public int top() {
        pq num=st.peek();
        return num.val;
    }
    
    public int getMin() {
         pq num=st.peek();
        return num.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */