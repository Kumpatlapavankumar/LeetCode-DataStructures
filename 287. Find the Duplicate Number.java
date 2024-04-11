class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int number=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                number=nums[i];
                break;
            }
        }
        if(number==0){
            return -1;
        }else{
            return number;
        }
    }
}
