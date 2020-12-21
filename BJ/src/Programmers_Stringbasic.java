
public class Programmers_Stringbasic {
	public static boolean solution(String s) {
		boolean answer = true;
		s.
		for(int i = 0; i< s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(c < 48 || c > 57) {
				answer = false;
				break;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a234";
		boolean answer = solution(s);
		System.out.println(answer);
		
	}
	

}
