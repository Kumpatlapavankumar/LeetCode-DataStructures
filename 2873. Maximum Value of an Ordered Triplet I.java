class Solution {
    public long maximumTripletValue(int[] nums) {
        long mx=0;
        int n=nums.length;
        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    if (i<j && j<k){
                        mx=Math.max(((long)nums[i]-(long)nums[j])*nums[k], mx);
                    }
                }
            }
        }
        return mx;
    }
}
