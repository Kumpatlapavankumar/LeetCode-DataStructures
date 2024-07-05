class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int count=0;
        int result=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count=0;
            }else{
                count++;
                result=Math.max(result,count);
            }
        }
        return result;
    }
}
