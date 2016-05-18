import java.util.ArrayList;
import java.util.Collections;


public class WaveArray {
	public static void main(String[] args){
		
	}
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
	    for(int i = 1 ; i < a.size() ; i=i+2){
	        int temp = a.get(i);
	        a.set(i, a.get(i-1));
	        a.set(i-1, temp);
	    }
	    return a;
	}
	
//	This is O(nLogn) solution. O(n) solution is possible, 
//	but for this question we needed the lexicographically smallest solution
	
}
