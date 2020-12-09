package level8_Math1;



import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i =0; i<T; i++) {
			
			int start = sc.nextInt();
			int dest = sc.nextInt();
			
			//거리
			int distance = dest - start;
			int max_move = (int)Math.sqrt(distance);
			
			if(max_move == Math.sqrt(distance)) {
				System.out.println((max_move*2) - 1);
			}
			else if(distance <= (max_move*max_move) + max_move) {
				System.out.println(max_move * 2);
			}
			else {
				System.out.println((max_move*2) + 1);
			}
			
		}
		
	}

}
