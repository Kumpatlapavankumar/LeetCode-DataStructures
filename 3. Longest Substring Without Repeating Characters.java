class Solution {
    public int lengthOfLongestSubstring(String name) {
        int start=0;
        int maxlength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int end=0;end<name.length();end++){
            char tem=name.charAt(end);
            if(map.containsKey(tem)){
                start=Math.max(start,map.get(tem)+1);
            }
            maxlength=Math.max(maxlength,end-start+1);
            map.put(tem,end);
        }
        return maxlength;
    }
}
