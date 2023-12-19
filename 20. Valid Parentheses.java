class Solution {
    public boolean isValid(String str) {
        Stack <Character> st=new Stack<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='('){
				st.push(str.charAt(i));
			}else if(!st.empty() && ((str.charAt(i)==']' && st.peek()=='[') ||
			        (str.charAt(i)=='}' && st.peek()=='{') ||
					(str.charAt(i)==')' && st.peek()=='('))){
						st.pop();
					}else{
						st.push(str.charAt(i));
					}
		}
			if(st.empty()){
                return true;
		}else{
			return false;
		}
    }
}
