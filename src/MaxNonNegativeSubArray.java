import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaxNonNegativeSubArray {
	public static void main(String[] args){
		ArrayList<Integer> inp;
		Integer[] inpArray = {1967513926, 1540383426, -1303455736, -521595368};
		inp = new ArrayList<Integer>(Arrays.asList(inpArray));
		
		System.out.println(maxset(inp));
	}
	
	
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		long msum = 0;
		int ms = 0;
		int me = -1;
		long csum = 0;
		int cs = 0;
		int ce = 0;
		long ml = 0;
		long cl = 0;
		long prev = 0;
		for(int i = 0 ; i < a.size() ; i++){
			System.out.println("before i " + i + " a[i] " + a.get(i) + " max " + msum + " curr " + csum);
			if(a.get(i) < 0){
				csum = 0;
			}else{
				if(prev < 0){
					cs = i;
				}
				csum+= a.get(i);
				ce = i;
				if(csum == msum && ce - cs > me - ms){
						msum = csum;
						ms = cs;
						me = ce;
				}else if(csum > msum){
					msum = csum;
					ms = cs;
					me = ce;
				}
			}
			prev = a.get(i);
//			System.out.println("after i " + i + " a[i] " + a.get(i) + " max " + msum + " curr " + csum);
//			System.out.println("========");
		}
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = ms ; i <= me ; i++){
			res.add(a.get(i));
		}
		return res;
	}
	
	
}
