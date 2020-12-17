package sort;

import java.util.Scanner;

public class MergeSort {
	
	public static int[] arr;
	public static int[] tmp;
	
	
	public static void merge(int start, int middle, int end) {
		
		int sp_1 = start;
		int sp_2 = middle + 1;
		int index = sp_1;
		
		//작은 순서대로 배열에 삽입하는 작업
		while(sp_1 <= middle && sp_2 <= end) {
			if(arr[sp_1] < arr[sp_2]) {
				tmp[index] = arr[sp_1];
				sp_1++;
			}
			else {
				tmp[index] = arr[sp_2];
				sp_2++;
			}
			index++;	
		}
		
		//나음 데이터 값을 배열에 삽입한다.
		if(sp_1 > middle) {
			for(int t = sp_2; t <= end; t++) {
				tmp[index] = arr[t];
				index++;
			}
		}
		else {
			for(int t = sp_1; t <= middle; t++) {
				tmp[index] = arr[t];
				index++;
			}
		}
		
		for(int i = 0; i<= arr.length; i++) {
			arr[i] = tmp[i];
		}
		
	}
	
	public static void mergeSort( int start, int end) {
		if(start < end) {
			int middle = (start + end)/2;
			mergeSort(start, middle);
			mergeSort(middle+1, end);
			merge(start, middle, end);
		}
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		arr = new int[n];
		tmp = new int[n];
			
		// 배열에 정렬할 값들을 입력해준다
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(0, arr.length-1);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}	
}
