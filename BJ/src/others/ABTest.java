package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution2{
	public int[] solution(int[] numbers) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i ++) {
			for(int j = i + 1; j < numbers.length; j++) {
				list.add(numbers[i] + numbers[j]);
			}
		}
		for( int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++ ) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i< answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}

public class ABTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] arr = new int[t];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution2 sol = new Solution2();
		int[] result = sol.solution(arr);
		
		System.out.println(Arrays.toString(result));
		

	}

}
