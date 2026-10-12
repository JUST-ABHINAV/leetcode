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
    
    public boolean startsWith(String word) {
        TrieNode curr=root;
        for (char ch:word.toCharArray()){
            if(!curr.map.containsKey(ch)){
                return false;
            }
            else{
                curr=curr.map.get(ch);
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */