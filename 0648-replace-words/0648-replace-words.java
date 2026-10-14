class TrieNode{
    HashMap<Character,TrieNode> map=new HashMap<>();
    boolean isEnd=false;
}
class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    public void insert(String word) {
        TrieNode curr=root;
        for (char ch:word.toCharArray()){
        if (!curr.map.containsKey(ch)){
            curr.map.put(ch,new TrieNode());
            curr=curr.map.get(ch);
        }
        else{
            curr=curr.map.get(ch);
        }
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for (char ch:word.toCharArray()){
            if(!curr.map.containsKey(ch)){
                return false;
            }
            else{
                curr=curr.map.get(ch);
            }
        }
        if (curr.isEnd==true)return true;
        return false;
    }
    
    public String startsWith(String word) {
        TrieNode curr=root;
        String st="";
        for (char ch:word.toCharArray()){
            if(curr.isEnd==true)return st;
            if(!curr.map.containsKey(ch)){
                return "";
            }
            else{
                curr=curr.map.get(ch);
                st+=ch;
            }
        }
        
        return "" ;
    }
}

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie t=new Trie();
        for (int i=0;i<dictionary.size();i++){
            t.insert(dictionary.get(i));
        }
        String[] arr=sentence.split(" ");

        StringBuilder sb=new StringBuilder();
        for (String s:arr){
            if (t.startsWith(s).equals("")){
                sb.append(s);
                sb.append(" ");
            }
            else{
                sb.append(t.startsWith(s));
                sb.append(" ");
            }
        }
        return sb.toString().strip();

        
    }
}