import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {
//	public static void main(String[] args){
//		Scanner s = new Scanner(System.in);
//		int n  = s.nextInt();
//		int k = s.nextInt();
//		int[] M = new int[n];
//		for(int i = 0 ; i < n ; i++){
//			M[i] = s.nextInt();
//		}
//		
//		//System.out.println(Arrays.toString(M));
//		
//		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
//		for(int i = 0 ; i < n ; i++){
//			if(hm.containsKey(M[i])){
//				hm.put(M[i], hm.get(M[i]) + 1);
//			}else{
//				hm.put(M[i], 1);
//			}
//		}
//		
//		if (hm.size() <= k){
//			System.out.println(n);
//			return;
//		}
//		
//		Object[] keys = hm.keySet().toArray();
//		Arrays.sort(keys);
//		System.out.println(Arrays.toString(keys));
//		int ranks = 0;
//        int prizes = 0;
//		for(int i = keys.length - 1 ; i >= 0 ; i--){
//			
//			Object key = keys[i];
//            ranks++;
//			prizes += hm.get(key);
//			System.out.println("key " + key + " ranks " + ranks + " prizes " + prizes);
//			if(ranks >= k){
//				System.out.println(prizes);
//				return;
//			}
//		}
//	}
}
