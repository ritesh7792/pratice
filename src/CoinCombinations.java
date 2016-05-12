import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CoinCombinations {
	
	public static void printres(ArrayList<ArrayList<Integer>> res){
		for(int i = 0 ; i < res.size() ; i++){
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}
	
	public static void main(String[] args){
		ArrayList<Integer> inp = new ArrayList<Integer>();
		
		inp.add(8);
		inp.add(10);
		inp.add(6);
//		inp.add(11);
//		inp.add(1);
//		inp.add(16);
//		inp.add(8);
		
		printres(combinationSum(inp, 18));
		
		
	}
	
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		
		Collections.sort(a);
		int i = 1;
		while(i < a.size()){
			if(a.get(i) == a.get(i-1)){
				a.remove(i);
			}else{
				i++;
			}
		}
		Collections.reverse(a);
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		int count = 0;
		util(a,b,curr,res, count);
//		Collections.reverse(res);
		return res;
	}
	
	public static void util(ArrayList<Integer> a, int b, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> res, int count){
		System.out.println("getting A " + a + " b " + b + " curr " + Arrays.toString(curr.toArray()) + " count " + count); 
		if(b == 0){
//			System.out.println("one sol found");
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			Collections.sort(temp);
			res.add(temp);
//			printres(res);
			return;
		}
		if(b < 0){
			return;
		}
		if(a.size() == 0 && b > 0){ 
//			System.out.println(Arrays.toString(a.toArray()));
			return;
		}
//		if(count > 20){ 
//			return;
//		}
		int num = 0;
		
		num = a.get(a.size() - 1);
//		num = a.get(0);
		
		curr.add(num);
//		System.out.println("Passing A " + a + " b " + b + " curr " + Arrays.toString(curr.toArray()) + " count " + count); 
		util(a, b-num, curr, res, ++count);
		curr.remove(curr.size()-1);

		num = a.remove(a.size()-1);
//		num=a.remove(0);
		System.out.println("Passing A " + a + " b " + b + " curr " + Arrays.toString(curr.toArray()) + " count " + count); 
		util(a,b,curr,res, ++count);
		a.add(num);
	}
}
