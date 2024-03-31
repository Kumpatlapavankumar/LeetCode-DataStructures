class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(nums[i]*nums[i]);
        }
        for(int j=0;j<arr.length-1;j++){
            int min=j;
            for(int k=j;k<arr.length;k++){
                if(arr[k]<arr[min]){
                    min=k;
                }
            }
            int temp=arr[min];
            arr[min]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
