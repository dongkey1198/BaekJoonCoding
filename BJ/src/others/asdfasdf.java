package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class asdfasdf {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        StringTokenizer st = new StringTokenizer(str,".");
        String[] arr = new String[2];
        int i =0;
        while(st.hasMoreTokens()){
            arr[i] = st.nextToken();
            i++;
        }
        
        for(String s: arr){
            System.out.println(s);
        }
		
	}

}
