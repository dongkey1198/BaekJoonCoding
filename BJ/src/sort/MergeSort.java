package sort;

public class MergeSort {
	
	public static int[] arr;
	public static int[] tmp;

	public static void main(String[] args) {
		
		arr = new int[]{1, 4, 8, 6, 9, 7, 3, 5, 2};
		tmp = new int[arr.length];
		
		//첫 번째 index와 마지막 index 넘버를 매개변수로 보낸다.
		mergeSort(0, arr.length-1);
		printArray();
	}
	
	public static void mergeSort(int start, int end) {
		
		if(start < end) {
			int mid = (start+end) / 2;
			// 첫번째 부터 중간까지
			mergeSort(start, mid);
			//중간 다음부터 마지막까지
			mergeSort(mid+1, end);
			
			int p = start;
			int q = mid + 1;
			int idx = p;
			
			while(p <= mid || q <= end) {
				if(q > end || (p <= mid && arr[p] < arr[q])) {
					tmp[idx++] = arr[p++];
				}
				else {
					tmp[idx++] = arr[q++];
				}
			}
			
			for(int i = start; i <= end; i++) {
				arr[i] = tmp[i];
			}
			for(int a : tmp) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	public static void printArray() {
		
		for(int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
