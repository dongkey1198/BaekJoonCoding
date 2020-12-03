package others;

public class Programmers_level1_mid_char {
	
	
	
	public static void main(String[] args) {
	
	String s ="abcde";
	if(s.length()%2 == 0) {
		s = s.substring((s.length()/2)-1, s.length()/2+1);
	}else {
		char c = s.charAt((s.length()/2));
		s = Character.toString(c);
		
	}
	System.out.println(s);
	}

}
