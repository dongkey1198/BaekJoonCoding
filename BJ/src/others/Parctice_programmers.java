package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parctice_programmers {
	
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		List <String> list = Arrays.asList(participant);
		Collections.sort(list);
		Arrays.sort(completion);
		for(int i = 0; i<completion.length; i++) {
			if(list.contains(completion[i])) {
				list.remove(i);
			}
		}
		answer = list.get(0);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Parctice_programmers instance = new Parctice_programmers();
		
		String answer = instance.solution(participant, completion);
		System.out.println(answer);
		

	}

}
