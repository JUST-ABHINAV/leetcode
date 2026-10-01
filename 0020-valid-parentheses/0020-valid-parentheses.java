class Solution {
    public boolean isValid(String s) {
        Stack<Character>  st=new Stack<>();
        char[] arr=s.toCharArray();
        for (char ch:arr){
            if(ch=='(' ||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())return false;
                char c=st.pop();
                System.out.print(c+" "+ch);
                if(ch==')' && c!='(')return false;
                else if(ch==']' && c!='[')return false;
                else if(ch=='}' && c!='{')return false;
            }
        }
        if(!st.isEmpty())return false;
        return true;
        
    }
}