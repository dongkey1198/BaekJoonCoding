package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parctice_programmers {
	
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		String tmp = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0 ; i < participant.length; i++) {
				if(!participant[i].equals(completion[i])) {
					tmp = participant[i];
					break;
			}
		}
		if(tmp != "") {
			answer = tmp;
		}
		else {
			answer = participant[participant.length - 1];
		}
		
		
		
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
