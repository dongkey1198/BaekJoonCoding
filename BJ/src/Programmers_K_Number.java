import java.util.Arrays;

public class Programmers_K_Number {
	
	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for(int i = 0; i<commands.length; i++) {
			int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
			int start_p = commands[i][0] - 1;
			int end_p = commands[i][1] - 1;
			int cnt = 0;
			for (int j = start_p; j <= end_p; j++) {
				tmp[cnt] = array[j];
				cnt++;
			}
			
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2] - 1];
		}
		
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = solution(array, commands);
		for(int i : result) {
			System.out.println(i);
		}
	}

}
