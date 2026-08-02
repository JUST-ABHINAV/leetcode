class Solution {
    public String removeStars(String s) {
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for (char ch:arr){
            if (ch=='*'){
                if (!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}