package broteForece;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] dwarfs = new int[9];
		int max = 0;
		
		for(int i =0; i < dwarfs.length; i++) {
			dwarfs[i] = sc.nextInt();
			max += dwarfs[i];
		}
		
		//가짜 난쟁이들의 키의 합
		int two_dwarfs_sum = max-100;
		int[] result = getResult(dwarfs, two_dwarfs_sum);
		for(int a: result) {
			System.out.println(a);
		}
	}
	static int[] getResult(int[] dwarfs, int two_dwarfs_sum) {
		int dwarf1 = 0;
		int dwarf2 = 0;
		int[] result = new int[7];
		
		//구라친 두명 찾기
		for(int i = 0; i<dwarfs.length-1; i++) {
			for(int j = i+1; j<dwarfs.length; j++) {
				if(dwarfs[i]+dwarfs[j] == two_dwarfs_sum) {
					dwarf1 = dwarfs[i];
					dwarf2 = dwarfs[j];
				}
			}
		}
		int i = 0;
		for(int a : dwarfs) {
			if(a != dwarf1 && a != dwarf2) {
				result[i] = a;
				i++;
			}
		}
		Arrays.sort(result);
		return result;
		
	}

}
