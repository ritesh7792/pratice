import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class DistinctNumbersInWindow {
	
	
	public static void main(String[] args){
		ArrayList<Integer> inp = new ArrayList<Integer>();
		inp.add(1);
		inp.add(2);
		inp.add(1);
		inp.add(3);
		inp.add(4);
		inp.add(3);
		System.out.println(dNums(inp, 3).toString());
	}
	
	public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
		System.out.println(A.toString());
		ArrayList<Integer> res = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int lastInd = 0;
		
		
		for(int i = 0 ; i < B ; i++){
			if(!hm.containsKey(A.get(i))) hm.put(A.get(i), 1);
			else{
				hm.put(A.get(i),hm.get(A.get(i))+1);
				
			}
			System.out.println("i = " + i + " | A[i] = " + A.get(i) + " | lastInd = " + lastInd + " | Hashset = " + hm.toString());
		}
		res.add(hm.size());
		for(int i = B ; i < A.size() ; i++){
			hm.put(A.get(lastInd),hm.get(A.get(lastInd))-1);
			if(hm.get(A.get(lastInd)) == 0){
				hm.remove(A.get(lastInd));
			}
			if(!hm.containsKey(A.get(i))) hm.put(A.get(i), 1);
			else{
				hm.put(A.get(i),hm.get(A.get(i))+1);
				
			}
			System.out.println("i = " + i + " | A[i] = " + A.get(i) + " | lastInd = " + lastInd +" | Hashset = " + hm.toString());
			res.add(hm.size());
			lastInd++;
		}
		return res;
		
    }
	
}
