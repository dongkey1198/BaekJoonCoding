package sort;

import java.util.Scanner;

public class MergeSort3 {
	
	public static int[] MergeSort(int[] arr, int first, int last) {
		if(first < last) {
			int middle =(first+last)/2;
			MergeSort(arr, first, middle);
			MergeSort(arr, middle+1, last);
			Sort(arr,first, middle, last);
		}
		return arr;
	}
	
	public static void Sort(int[] arr, int first, int middle, int last) {
		
		int tmp_arr[] = new int[arr.length];
		int left_start = first;
		int right_start = middle+1;
		int tmp_index = first;
		
		while(left_start<=middle && right_start <= last) {
			
			if(arr[left_start] < arr[right_start]) {
				tmp_arr[tmp_index] = arr[left_start];
				left_start++;
			}
			else {
				tmp_arr[tmp_index] = arr[right_start];
				right_start++;
			}
			tmp_index++;
		}
		
		
		while(left_start<=middle) {
			tmp_arr[tmp_index] = arr[left_start];
			left_start++;
			tmp_index++;
		}
		while(right_start<=last) {
			tmp_arr[tmp_index] = arr[right_start];
			right_start++;
			tmp_index++;
		}
		
		for(int i = first; i <= last; i++) {
			arr[i] = tmp_arr[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr = MergeSort(arr, 0, arr.length-1);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
