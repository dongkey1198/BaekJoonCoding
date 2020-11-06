package level2_If;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
        
        if(x >= -1000 && x<=1000) {
			if(y >= -1000 && y<=1000) {
				if(x>0 && y>0){
					result = 1;
				}
				else if(x<0 && y>0) {
					result = 2;
				}
				else if(x<0 && y<0) {
					result = 3;
				}
				else {
					result = 4;
				}
			}
			else {
				System.out.println("Out of Range");
			}
		}
		else {
			System.out.println("Out of Range");
		}
		System.out.println(result); 
	}

}
