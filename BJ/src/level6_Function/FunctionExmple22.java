package level6_Function;

public class FunctionExmple22 {
	
	public static int getD(int n) {
		
		 int dn = n;
	        while(n > 0) {
	            dn += n % 10;
	            n /= 10;
	        }
	        return dn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] aa = new boolean[101];
		
		for(int i = 1; i <= 100; i++) {
			int dN = getD(i);
			if(dN <= 100) {
				aa[dN] = true;
			}
		}
		
		for(int i = 1; i < aa.length; i++) {
			if(!aa[i]) {
				System.out.println(i);
			}
			
		}
		
	}

}
