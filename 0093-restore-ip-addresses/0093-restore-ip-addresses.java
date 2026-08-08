class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<String>();
        helper(s,ans,0,0,"");
        return ans;

    }
   public boolean helper(String s, List<String> ans,int idx,int p,String curr){
        if(p==4&&idx==s.length()){
           
            ans.add(curr.substring(0,curr.length()-1));
            return true;
        }
         if(p==4||idx==s.length()){
            return false;
        }
        String oct="";
        for(int i=0;i<3&&idx+i<s.length();i++){
            oct+=(s.charAt(idx+i));
            if(validate(oct)){
                helper(s,ans,idx+i+1,p+1,curr+oct+".");
            }
        }
        return false;
    }
    public boolean validate(String oct){
        if(oct.length()>1&&oct.charAt(0)=='0')return false;
        if(Integer.parseInt(oct)<=255)return true;
        return false;
    }
}