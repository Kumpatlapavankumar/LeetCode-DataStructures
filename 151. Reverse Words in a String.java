class Solution {
    //donot edit this code
    public String reverseWords(String s) {
        s = s.trim();
        char[] str=s.toCharArray();
        int start=0;
        for(int end=0;end<str.length;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,str.length-1);
        reverse(str,0,str.length-1);
        String result=new String(str);
        String[] words = result.split("\\s+");
        result = String.join(" ", words);
        return result;
    }
    public void reverse(char[] str,int low,int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
    }
}
