import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.math.BigInteger;


public class kthPermutation {
	public static void main(String[] agrs){
		getPermutation(4, 11);
	}
	
	public static String getPermutation(int n, int k) {
		ArrayList<BigInteger> a = new ArrayList<BigInteger>();
		ArrayList<BigInteger> b = new ArrayList<BigInteger>();
		StringBuilder res = new StringBuilder();
		String s = Integer.toString(n);
		BigInteger fac = factorial(n);
		int temp;
		BigInteger K = new BigInteger(Integer.toString(k-1));
		BigInteger N = new BigInteger(Integer.toString(n));
		BigInteger rem;
		BigInteger quo;
		for(int i = 0 ; i < n ; i++){
			fac = fac.divide((new BigInteger(Integer.toString(n-i))));
			quo = K.divide(fac);
			rem = K.remainder(fac);
//			System.out.println("i = " + i + " || N = " + N + " || K = " + K + " || fac = " + fac + " || quo = " + quo + " || rem = " + rem);
			a.add(quo);
			K = rem;
			b.add(new BigInteger(Integer.toString(i+1)));
		}
		for(int i = 0 ; i < a.size() ; i++){
			temp = Integer.parseInt(a.get(i).toString());
			res.append(b.get(temp));
			b.remove(temp);
		}
		
		
		System.out.println((res.toString()));
		return null;
		
		
		
		
	}
	
	public static BigInteger factorial(int x){
		BigInteger res = new BigInteger("1");
		for(int i = 2 ; i <= x ; i++){
			res = res.multiply((new BigInteger(Integer.toString(i))));
		}
		return res;
	}
	
	
}
