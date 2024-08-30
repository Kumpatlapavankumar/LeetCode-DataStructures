class StockSpanner {
    Stack<Integer> stack;
    ArrayList<Integer> list;
    public StockSpanner() {
        stack=new Stack<>();
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        while(stack.isEmpty()==false && list.get(stack.peek())<=price){
            stack.pop();
        }
        int span=stack.isEmpty()?-1:stack.peek();
        int ans=(list.size()-1)-span;
        stack.push(list.size()-1);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
