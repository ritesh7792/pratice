import java.util.HashMap;


public class TrieNode {
	HashMap<Character, TrieNode> children;
	int freq;
	char val;
	boolean leaf;
	
	public TrieNode(){
		this.children = new HashMap<Character, TrieNode>();
		this.freq = 0;
	}
	
	public TrieNode(char c){
		this.val = c;
		this.freq = 0;
		this.children = new HashMap<Character, TrieNode>();
		
	}
}
