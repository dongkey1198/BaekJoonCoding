
public class StringExample {

	public static void main(java.lang.String[] args) {
		long n = 1234L;
		String s = Long.toString(n);
		
		int[] arr = new int[s.length()];
		int cnt = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			String tmp = "";
			tmp += s.charAt(i);
			arr[cnt++] = Integer.parseInt(tmp);
		}
		
		for(int i : arr) {
			System.out.println(i + " ");
		}

	}

}
