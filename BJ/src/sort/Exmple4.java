package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Exmple4 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String N = br.readLine();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < N.length(); i++) {
			String tmp = N.substring(i, i+1);
			list.add(Integer.parseInt(tmp));
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i : list) {
			sb.append(i);
		}
		
		System.out.println(sb);

	}

}
