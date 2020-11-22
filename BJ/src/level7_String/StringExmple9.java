package level7_String;

import java.util.Scanner;

public class StringExmple9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();    
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		for(int i=0;i<arr.length;i++){
			if(str.contains(arr[i])){
				str = str.replace(arr[i]," ");
		    	}
			}   
		System.out.println(str.length());
	}
}
