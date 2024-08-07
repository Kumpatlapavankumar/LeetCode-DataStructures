class Solution {
//donot edit this code
    public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int start=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                start=start-m.get(s.charAt(i));
            }else{
                start=start+m.get(s.charAt(i));
            }
        }
        return start;
    }
}
