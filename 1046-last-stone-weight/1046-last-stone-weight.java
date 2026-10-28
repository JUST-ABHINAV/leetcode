class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i:stones){
            pq.add(i);
        }
        while (pq.size()>1){
            int m=pq.poll();
            int n=pq.poll();
            if (m==n){
                continue;
            }
            else if (m>n){
                pq.add(m-n);
            }
            else pq.add(n-m);
        }
        if (pq.size()==0)return 0;
        return pq.poll();
    }
}