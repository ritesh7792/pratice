import java.util.ArrayList;
import java.util.Arrays;


public class AllPermutations {
	public static void main(String[] args){
		ArrayList<Integer> inp = new ArrayList<Integer>();
		inp.add(1);
		inp.add(2);
		inp.add(3);
		printres(permute(inp));
	}
	
	public static void printres(ArrayList<ArrayList<Integer>> res){
		for(int i = 0 ; i < res.size() ; i++){
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}
	
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		util(a, res , new ArrayList<Integer>());
		return res;
	}
	
	public static void util(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> curr){
		if(a.size() == 0){
			res.add(new ArrayList<Integer>(curr));
			return;
		}
		
		for(int i = 0 ; i < a.size() ; i++){
			int temp = a.get(i);
			curr.add(temp);
			a.remove(i);
			util(a,res,curr);
			a.add(i,temp);
			curr.remove(curr.size()-1);
		}

	}
}
