import java.util.ArrayList;
import java.util.Arrays;


public class CoinChange {
	
	public static void main(String[] args){
		Integer[] a = { 1, 2, 3 };
		ArrayList<Integer> inp = new ArrayList(Arrays.asList(a));
		System.out.println(coinchange2(inp, 4));
	}
	
	public static int coinchange2(ArrayList<Integer> a, int n) {
		int m = a.size();
		long[][] table = new long[n+1][m];
		long x;
		long y;
		for(int i = 0 ; i < m ; i++){
			table[0][i] = 1;
		}
		for(int i = 1 ; i < n+1 ; i++){
			for(int j = 0 ; j < m ; j++){
				x = 0;
				y = 0;
				if(i-a.get(j) >= 0){
					x = table[i-a.get(j)][j];
				}
				if(j-1>= 0){
					y = table[i][j-1];
				}
				System.out.println("X " + x + " Y " + y);
				table[i][j] = x + y;
			}
		}
		return (int)(table[n][m-1]);
	}
}
