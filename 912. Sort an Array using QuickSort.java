class Solution {
    public int[] sortArray(int[] nums) {
        Quicksort(nums,0,nums.length-1);
        return nums;
    }
    public static void Quicksort(int[] number,int first,int last){
        if(first<last){
           int p=partition(number,first,last);
            Quicksort(number,first,p-1);
            Quicksort(number,p+1,last);
        }
    }
    public static int partition(int[] number,int first,int last){
        int pivot=number[last];
        int p=first-1;
        for(int i=first;i<=last;i++){
            if(number[i]<pivot){
                int temp=number[i];
                number[i]=number[p+1];
                number[p+1]=temp;
                p++;
            }
        }
        int temp1=number[p+1];
        number[p+1]=number[last];
        number[last]=temp1;
        return p+1;
    }
}
