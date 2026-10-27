class pair{
    int index;
    double dis;
    pair(int i,double d){
        index=i;
        dis=d;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a, b) -> Double.compare(a.dis, b.dis));
        for (int i=0;i<points.length;i++){
            double dis = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            pq.add(new pair(i,dis));
        }
        int [][]arr=new int[k][2];
        for (int i=0;i<k;i++){
            arr[i]=points[pq.poll().index];
        }
        return arr;
    }
}