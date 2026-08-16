class Solution {
    public int calPoints(String[] arr) {
       Stack<Integer> st=new Stack<>();
       int sum=0;
       for (int i=0;i<arr.length;i++){
        String s=arr[i];
        if (s.equals("+")){
            int n=st.pop();
            // if (!st.isEmpty()){
            int m=st.pop();
            st.push(m);
            st.push(n);
            st.push(m+n);
            sum+=(m+n);
            // }
            // else {
            //     int m=arr[i-1].charAt(0)-'0';
            //     st.push(n);
            //     st.push(m+n);
            //     sum+=(m+n);
            // }
        }
        else if(s.equals("C")){
            sum-=st.pop();
        }
        else if(s.equals("D")){
            int n=st.pop();
            st.push(n);
            st.push(n*2);
            sum+=(n*2);
        }
        else{
            st.push(Integer.parseInt(s));
            sum+=Integer.parseInt(s);
        }
       }

       if (st.isEmpty())return 0;
       return sum;

    }
}