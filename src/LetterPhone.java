import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class LetterPhone {
	public static void main(String[] args){
		String s = "23";
		System.out.println(letterCombinations(s));
	}
	
	public static ArrayList<String> letterCombinations(String a) {
		ArrayList<String> res = new ArrayList<String>();
		StringBuilder s = new StringBuilder();
		HashMap<Character, char[]> hm = new HashMap<Character,char[]>();
		char[] temp2 = new char[3];
		temp2[0] = 'a';
		temp2[1] = 'b';
		temp2[2] = 'c';
		hm.put('2',temp2);
		char[] temp3 = new char[3];
		temp3[0] = 'd';
		temp3[1] = 'e';
		temp3[2] = 'f';
		hm.put('3',temp3);
		char[] temp4 = new char[3];
		temp4[0] = 'g';
		temp4[1] = 'h';
		temp4[2] = 'i';
		hm.put('4',temp4);
		
		char[] temp5 = new char[3];
		temp5[0] = 'j';
		temp5[1] = 'k';
		temp5[2] = 'l';
		hm.put('5',temp5);
		
		char[] temp6 = new char[3];
		temp6[0] = 'm';
		temp6[1] = 'n';
		temp6[2] = 'o';
		hm.put('6',temp6);
		
		char[] temp7 = new char[4];
		
		temp7[0] = 'p';
		temp7[1] = 'q';
		temp7[2] = 'r';
		temp7[3] = 's';
		hm.put('7',temp7);
		
		char[] temp8 = new char[3];
		temp8[0] = 't';
		temp8[1] = 'u';
		temp8[2] = 'v';
		hm.put('8',temp8);
		
		char[] temp9 = new char[4];
		temp9[0] = 'w';
		temp9[1] = 'x';
		temp9[2] = 'y';
		temp9[3] = 'z';
		hm.put('9',temp9);
		letterUtil(a, 0, s, res, hm);
		return res;
	}
	
	public static void letterUtil(String a, int pos, StringBuilder curr, ArrayList<String> res, HashMap<Character, char[]> hm){
		
//		System.out.println(hm);
		if(pos == a.length()) {
			res.add(curr.toString());
			System.out.println("Result ArrayList = " + res);
			return;
		}
		char n = a.charAt(pos);
		if(n == '1' || n == '0'){
			res.add(curr.toString());
			System.out.println("Result ArrayList = " + res);
			return;
		}
		
		char[] alph = hm.get(n);
		System.out.println("--------------------------------------------------------");
		System.out.println("a = " + a + "|| curr = " + curr + "|| n = " + n + " || " + Arrays.toString(alph));
		System.out.println("========================================================");
		StringBuilder temp;
		for(int i = 0 ; i < alph.length ; i++){
			temp = curr;
			curr = curr.append(alph[i]);
			System.out.println("a = " + a + " Aph[i] = " + alph[i] + " " + "|| curr = " + curr + "|| n = " + n + " || temp = " + temp + " || " + Arrays.toString(alph));
			
			letterUtil(a, pos+1, temp, res, hm);
			curr=curr.deleteCharAt(curr.length()-1);
		}
		
		
	}
}
