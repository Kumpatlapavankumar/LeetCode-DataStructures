class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[smallest]>nums[j]){
                    smallest=j;
                }
            }
            int temp=nums[smallest];
            nums[smallest]=nums[i];
            nums[i]=temp;
        }
    }
}
