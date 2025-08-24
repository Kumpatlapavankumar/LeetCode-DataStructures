class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,n=nums.length;
        int maxi=0,count=0;
        while(j<n){
            if(nums[j]==0){
                count++;
            }
            while(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            maxi=Math.max(maxi,j-i);
            j++;
        }
        
        return maxi;
    }
}
