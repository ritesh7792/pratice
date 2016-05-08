import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class generateAllParanthesis {
	public static void main(String[] args){
		System.out.println(Arrays.toString(generateParenthesis(3).toArray()));
	}
	
	public static ArrayList<String> generateParenthesis(int a) {
		ArrayList<String> res = new ArrayList<String>();
		StringBuilder curr = new StringBuilder();
		util(a,0,0,curr,res);
		return res;
	}
	
	public static void util(int a, int open, int close, StringBuilder curr, ArrayList<String> res){
		if(close == a){
			res.add(curr.toString());
			return;
		}
		if(open < a ){
			curr.append('(');
			util(a,open+1,close,curr,res);
			curr.deleteCharAt(curr.length()-1);
		}
		if(open > close){
			curr.append(')');
			util(a,open,close+1,curr,res);
			curr.deleteCharAt(curr.length()-1);
		}
		
	}
}
