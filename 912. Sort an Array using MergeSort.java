class Solution {
    public int[] sortArray(int[] nums) {
        int[] sortarray=sortedarray(nums);
        return sortarray;
    }
    public static int[] sortedarray(int[] number){
        return mergesort(number,0,number.length-1);
    }
    public static int[] mergesort(int[] number,int first,int last){
        if(first<last){
            int mid=first+(last-first)/2;
            mergesort(number,first,mid);
            mergesort(number,mid+1,last);
            merge(number,first,mid,last);
        }
        return number;
    }
    public static int[] merge(int[] number,int first,int mid,int last){
        int left=first;
        int right=mid+1;
        int k=0;
        int[] t=new int[number.length];
        while(left<=mid && right<=last){
            if(number[left]<=number[right]){
                t[k]=number[left];
                left++;
                k++;
            }else{
                t[k]=number[right];
                right++;
                k++;
            }
        }
        while(left<=mid){
            t[k]=number[left];
            left++;
            k++;
        }
        while(right<=last){
            t[k]=number[right];
            right++;
            k++;
        }
        k=0;
        left=first;
        while(left<=last){
            number[left]=t[k];
            k++;
            left++;
        }
        return number;
    }
}
