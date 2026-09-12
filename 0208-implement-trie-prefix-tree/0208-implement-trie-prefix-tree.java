class Trie {
    Trie children[]=new Trie[26];
    boolean isend;
    public Trie() {
        for(int i=0;i<26;i++){
            children[i]=null;
        }
        
    }
    // static Trie root=new Trie();
    
    public void insert(String word) {
        Trie curr=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
            Trie temp=new Trie();
            curr.children[idx]=temp;}
            curr=curr.children[idx];


        }curr.isend=true;
        
    }
    
    public boolean search(String word) {
        Trie curr=this;
        if(curr==null){
            return false;

        }
        
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];

        }return curr.isend;
        
    }
    
    public boolean startsWith(String prefix) {
        Trie curr=this;//use this here this refers to object which is calling 
        if(curr==null){
            return false;
        }
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
             curr=curr.children[idx];

        }return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */