package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question3033 {
	
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void func(String str) {
		int b = 2;
		
		for(int i = 0; i <str.length()-1; i++) {
			for(int j = 0; j<str.length() - (str.length() - b); j++) {
				list.add(str.substring(i, str.length()-j));	
				}
			b--;
			}
		
		for(int i = 0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			list.add(Character.toString(tmp));
		}	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
				
		sc.nextLine();
		
		String str = sc.nextLine();
		func(str);
		for(int i =0; i< list.size(); i++) {
			
		}
		System.out.println(list);
		
		
	}
}
