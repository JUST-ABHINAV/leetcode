class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets[k];
        int total=0;
        // ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<tickets.length;i++){
            if(i<=k){
            if(tickets[i]>=n){
                total+=n;
                // if (tickets[i]-n<=0)list.add(i);
                // else tickets[i]=tickets[i]-n;
            }
            else{
                total+=tickets[i];
                // list.add(i);
            }}
            else{
                if(tickets[i]>=n-1){
                total+=n-1;
                // if (tickets[i]-n<=0)list.add(i);
                // else tickets[i]=tickets[i]-n;
            }
                else{
                total+=tickets[i];
                // list.add(i);
            }
            }

        
        
        }
        return total;
    }
}