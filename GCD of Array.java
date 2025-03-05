
class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       //code here.
        int gcd_val=arr[0];
        for(int i=1;i<N;i++)
        {
            gcd_val=Gcd(arr[i],gcd_val);
            if(gcd_val==1)
            return 1;
        }
        return gcd_val;
    }
    
    int Gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    } 
}
