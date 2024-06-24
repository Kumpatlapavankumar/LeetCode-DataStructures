int[] result=new int[Math.min(nums1.length-1, nums2.length-1)];
        int k=0;
        for(int i=0;i<=nums1.length-1;i++){
            if(i>0 && nums1[i]==nums1[i-1]){
                continue;
            }
            for(int j=0;j<=nums2.length-1;j++){
                if(nums1[i]==nums2[j]){
                    result[k]=nums1[i];
                    k++;
                    break;
                }
            }
        }
        return result;
