import java.util.ArrayList;
import java.util.Arrays;


public class NQueens {
	public static void main(String[] args){
		printRes(solveNQueens(1));
	}
	
	public static void printRes(ArrayList<ArrayList<String>> res){
		for(int i = 0 ; i < res.size() ; i++){
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}
	
	public static ArrayList<ArrayList<String>> solveNQueens(int a) {
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		util(a,0,new ArrayList<Integer>(),res);
		
		return res;
	}
	
	public static boolean isSafe(int k, int pos, ArrayList<Integer> curr){
		System.out.println("k = " + k + " pos " + pos + " curr " + Arrays.toString(curr.toArray()));
		for(int i = 0 ; i < k ; i++){
//			System.out.println("i = " + i + " curr.size() " + curr.size());
			if(curr.get(i) == pos 
				|| curr.get(i) == pos-(k-i) 
				|| curr.get(i) == pos+(k-i))
			{
				
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<String> makeRes(ArrayList<Integer> curr){
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> res = new ArrayList<String>();
		int num;
		for(int i = 0 ; i < curr.size() ; i++){
			temp = new ArrayList();
			num = curr.get(i);
			int j = 0;
			for(j = 0 ; j < num ; j++){
				temp.add(".");
			}
			if(j == num) temp.add("Q");
			for(j = num+1 ; j < curr.size(); j++){
				temp.add(".");
			}
//			System.out.println(temp.toString());
			res.add(new ArrayList(temp).toString());
		}
		
		return res;
	}
	
	public static void util(int a, int k, ArrayList<Integer> curr, ArrayList<ArrayList<String>> res){
//		System.out.println("Entered k " + k + " curr " + Arrays.toString(curr.toArray()));
		if(k == a){
			res.add(makeRes(curr));
		}else{
			for(int i = 0 ; i < a ; i++){
//				System.out.println("-----");
//				System.out.println("Entered k " + k + " i " + i + " curr " + Arrays.toString(curr.toArray()));
				if(isSafe(k, i, curr) == true){
					curr.add(k,i);
					util(a, k+1, curr, res);
					curr.remove(curr.size()-1);
				}
			}
		}
	}
}
