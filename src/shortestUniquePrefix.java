import java.util.ArrayList;


public class shortestUniquePrefix {
	
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("bearcat");
		al.add("bert");
//		al.add("duck");
//		al.add("dove");
		ArrayList<String> res = prefix(al);
		System.out.println(res.toString());
	}
	
	public static void insert(TrieNode root, String s){
		int len = s.length();
		char c;
		
		for(int i = 0 ; i < s.length() ; i++){
			c = s.charAt(i);

			root.freq++;
			if(!root.children.containsKey(c)){ 
				System.out.println(" root   " + root.val+ " frequency " +root.freq + "  children " + root.children.keySet().toString() + "doesnt contain key "  + c );
				TrieNode temp = new TrieNode(c);
				root.children.put(c,temp);
				temp.leaf = true;
				root = temp;
				continue;
			}
			
			System.out.println(" root   " + root.val + " frequency " +root.freq + "    children " + root.children.keySet().toString() + "    contains key "  + c);
			root = root.children.get(c);

		}
	}
	
	public static String findPrefix(TrieNode root, String s){
//		System.out.println();
//		System.out.println("String to be found :" + s);
		StringBuilder res = new StringBuilder();
		int len = s.length();
		char ch;
		TrieNode temp;
		for(int i = 0; i < len ; i++){
			ch = s.charAt(i);

			temp = root.children.get(ch);
			res.append(ch);
//			System.out.println("res :" + res + " curr char " + temp.val + " freq " + temp.freq);
			if(temp.freq == 1){	
				break;
			}
			root = temp;

		}
		return res.toString();
	}
	
	public static void printTrie(TrieNode root){
		System.out.print(root.val + " ");
		if(root.children.size() != 0){
			for(char key : root.children.keySet()){
				printTrie(root.children.get(key));
			}
		}
	}
	
	public static ArrayList<String> prefix(ArrayList<String> a) {
		String s;
		TrieNode root = new TrieNode();
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0 ; i < a.size() ; i++){
			s = a.get(i);
			insert(root, s);
		}
//		printTrie(root);
		for(int i = 0 ; i < a.size() ; i++){
			s = a.get(i);
			res.add(findPrefix(root, s));
		}
		return res;
		
	}
	
	
}
