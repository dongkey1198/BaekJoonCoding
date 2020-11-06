package level2_If;

import java.util.Scanner;

public class ExamGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        if(score >=0 && score <=100){
            if(score<60){
                System.out.println("F");
            }
            else if(score<70){
                System.out.println("D");
            }
            else if(score<80){
                System.out.println("C");
            }
            else if(score<90){
                System.out.println("B");
            }
            else{
                System.out.println("A");
            } 
        }
	}

}
