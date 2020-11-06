package level2_If;

import java.util.Scanner;

public class Alram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
		int min = sc.nextInt();
		int hour_changed = 0;
		int min_changed = 0;
        
        if(hour>=0 && hour<=23) {
			if(min>=0 && min <= 59) {
				if(min>=45) {
					hour_changed = hour;
					min_changed = min - 45;
				}
				else {
					if(hour == 0) {
						hour_changed = 23;
						min_changed = (60-45) + min;
					}
					else {
						hour_changed = hour - 1;
						min_changed = (60-45) + min;
					}
				}
			}
			else {
				System.out.println("Out of Range");
			}
		}
		else {
			System.out.println("Out of Range");
		}
        
        System.out.println(hour_changed+" "+min_changed);
        
	}

}
