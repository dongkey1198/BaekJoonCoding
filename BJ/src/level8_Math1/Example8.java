package level8_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sPoint = Integer.parseInt(br.readLine());
		int destination = Integer.parseInt(br.readLine());
		int distance = destination - sPoint;
		
		int move = 0;
		int cnt = 0;
		
		while(distance >= 0) {
			if(move == 0) {
				move++;
				distance -= move;
				cnt++;
			}
			else {
				if()
			}
		
						
			
			
		}
	}

}
