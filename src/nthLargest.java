import java.util.Arrays;
import java.util.Scanner;


public class nthLargest {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String inpString = s.nextLine();
		int n = s.nextInt();
		String[] inpArray = inpString.split(",");
		System.out.println(inpString);
//		for(int i = 0 ; i < inpArray.length ; i++){
//			System.out.println(inpArray[i]);
//		}
		int[] A = new int[inpArray.length];
		A[0] = Integer.parseInt(Character.toString(inpArray[0].charAt(1)));
		for(int i = 1 ; i < A.length ; i++){
			A[i] = Integer.parseInt(Character.toString(inpArray[i].charAt(0)));
		}
//		System.out.println(Arrays.toString(A));
		Arrays.sort(A);
		int count = 0;
		for(int i = A.length - 1 ; i >= 0 ; i--){
			count++;
			if (count == n){
				System.out.println(A[i]);
				return;
			}
		}
	}
}
