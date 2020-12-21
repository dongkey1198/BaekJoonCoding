import java.util.Arrays;
import java.util.Collections;

public class Programmers_string_reverse {

	public static void main(String[] args) {
		String s ="abcdZef";
		String ss ="";
		
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
