class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        int open=0;
        int close=0;
        StringBuilder sb=new StringBuilder();
        back(list,n,sb,open,close);
        return list;
        
    }
    public void back(List<String> list,int n,StringBuilder sb,int open,int close){
        if (sb.length()==2*n){
            list.add(sb.toString());
            return;
        }
        if (open<n){
            sb.append('(');
            // open++;
            back(list,n,sb,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if (close<open){
            sb.append(')');
            // close++;
            back(list,n,sb,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}