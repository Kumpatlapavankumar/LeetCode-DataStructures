class Solution {
//don't edit this code 
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                total=total+Math.min(tickets[i],tickets[k]);
            }else{
                total=total+Math.min(tickets[i],tickets[k]-1);
            }
        }
        return total;
    }

}
