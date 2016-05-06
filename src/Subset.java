import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subset {
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(8);
		a.add(15);
		a.add(19);
		a.add(1);
		
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res = subsets(a);
		printres(res);
	}
	
	public static void printres(ArrayList<ArrayList<Integer>> res){
		System.out.println("====== res ========");
		for(int i = 0 ; i < res.size() ; i++){
			System.out.println(res.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
		Collections.sort(a);
//		System.out.println(Arrays.toString(a.toArray()));
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> curr = new ArrayList<Integer>();
	    res.add(curr);
	    subsetsUtil(a,0,curr,res);
//	    for(int i = 0; i < a.size() ; i++){
////	    	System.out.println("new iteration");
//	        curr = new ArrayList<Integer>();
//	        subsetsUtil(a,i,curr,res);
//	    }
	    return res;
	}
	
	public static void subsetsUtil(ArrayList<Integer> a, int pos, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> res){
//		System.out.println("position " + pos + " a.size " + a.size());
//	    System.out.println("======");
	    if(pos >= a.size()){
	    	
//	    	System.out.println("end");
//	    	System.out.println(Arrays.toString(a.toArray()) + " || pos = " + pos + " || curr = " + Arrays.toString(curr.toArray()) + " || res = " + Arrays.toString(res.toArray()));
	        return;
	    }
//	    System.out.println("before");
//	    System.out.println(Arrays.toString(a.toArray()) + " || pos = " + pos + " || a[pos] = " + a.get(pos) + " || curr = " + Arrays.toString(curr.toArray()) + " || res = " + Arrays.toString(res.toArray()));
//	    System.out.println("after");

	    for(int i = pos ; i < a.size() ; i++){
		    System.out.println(Arrays.toString(a.toArray()) + " || i = " + i + " || pos = " + pos +" || curr = " + Arrays.toString(curr.toArray()) + " || res = " + Arrays.toString(res.toArray()));
	    	curr.add(a.get(i));
			ArrayList<Integer> temp = new ArrayList<Integer>(curr);
			res.add(temp);
			
			printres(res);
			subsetsUtil(a,i+1,curr,res);
			System.out.println("i " + i);
			System.out.println("curr size " + curr.size());
	    	curr.remove(curr.size()-1);
	    
	    }
	}
}
