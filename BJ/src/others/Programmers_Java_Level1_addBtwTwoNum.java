package others;

import java.util.Scanner;

public class Programmers_Java_Level1_addBtwTwoNum {

		// TODO Auto-generated method stub
		   public static long solution(int a, int b) {
		        long answer = 0;
		        
		        if(a>b) {
		            for(int i = b; i<=a; i++ ){
		                answer +=i;
		            }
		        } 
		        else if(a<b){
		            for(int j = a; j<=b; j++){
		                answer += j;
		            }
		        }
		        else{
		            answer = a;
		        }
		        
		        return answer;
		    }	
		   public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        long result = solution(a, b);
		        
		        System.out.println(result); 
		   }

}
