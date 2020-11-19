package others;

import java.util.Arrays;
import java.util.Scanner;

class Solution{
	public static int[] solution(int[] numbers) {
		
		int[] answer = getAnswer(numbers);
		return answer;
	}
	
	private static int[] getAnswer(int[] numbers) {
		int size = getSize(numbers.length);
		int arr[] = new int[size];
		int a = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j ++) {
				arr[a] = numbers[i] + numbers[j];
				a++;
			}
		}
		
		int[] result = removeSameNumber(arr);
		
		return null;
	}

	private static int[] removeSameNumber(int[] arr) {
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			for(int j = i +1; j < arr.length; j++  ) {
				if(arr[i] == arr[j]) {
					count ++;
				}
			}
		}
		int[] array = new int[count];
		for(int i = 0; i< arr.length; i++) {
			for(int j = i +1; j < arr.length; j++  ) {
				if(arr[i] == arr[j]) {
					count ++;
				}
			}
		}
		return null;
	}

	public static int getSize(int size) {
		
		int length = 0;

		for(int i = 1; i<size; i++) {
			length += (size-i);
		}
		return length;
	}
	
}

public class AAAA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();    
        }
        
        int[] result = Solution.solution(arr);
        System.out.println(result);
        
	}

}
