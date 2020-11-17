package level5_Array;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayExmaple4_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> arr = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			arr.add(sc.nextInt()%42);
		}
		
		System.out.println(arr.size());
		
	}

}
