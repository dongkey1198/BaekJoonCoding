import java.util.Arrays;
import java.util.Collections;

public class Programmers_string_reverse {

	public static void main(int[] args) {
		String s ="abcdZef";
		int n = s.length();
		int[] answer = new int[n]; 
		String ss = "";
		
		Character[]a = new Character[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
		}
		Arrays.sort(a, Collections.reverseOrder());
		for(char c : a) {
			ss += c;
		}
		System.out.println(ss);
	}

}
