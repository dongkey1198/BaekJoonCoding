package sort;

public class MergeSort_2 {
	
	public static int[] sorted;
	public static int[] arr;
	
	public static void merge(int a[], int start, int middle, int end) {
		
		int i = start;
		int j = middle + 1;
		int k = i;
		
		//작은 순서대로 배열에 삽입
		while(i <= middle && j <= end) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// 나음 데이터도 삽입
		if(i > middle) {
		 	if(i > middle) {
		 		for(int t = j; t <= end; t++) {
		 			sorted[k] = a[t];
		 		}
		 	}else {
		 		for(int t = i; t <= middle; t++ ) {
		 			sorted[k] = a[t];
		 			k++;
		 		}
		 	}
		}
		//정렬된 배열을 삽입
		for(int t = start; t <= end; t++) {
			a[t] = sorted[t];
		}
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		// 크기가 1 보다 큰경우
		if(start < end) {
			int middle = (start + end)/ 2;
			mergeSort(a, start, middle);
			mergeSort(a, middle+1, end);
			merge(a, start, middle, end);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		sorted = new int[number];
		
		arr = new int[]{7,6,5,8,3,5,9,1};
		mergeSort(arr, 0 , number -1);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
