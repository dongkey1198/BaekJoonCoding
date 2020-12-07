package level10_Recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Exampe2_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 		int num = Integer.parseInt(br.readLine());
 		
 		if(num == 0) {
 			bw.write("0\n");
 		}
 		else if(num == 1) {
 			bw.write("1\n");
 		}
 		else {
 			BigInteger[] dp = new BigInteger[num + 1];
 			dp[0] = BigInteger.ZERO;
 			dp[1] = BigInteger.ONE;
 			
 			for(int i = 2; i <= num; i++) {
 				dp[i] = dp[i-2].add(dp[i-1]);
 			}
 			bw.write(dp[num] + " ");
 		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
