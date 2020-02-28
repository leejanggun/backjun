package backjun_If;

import java.util.Scanner;

class score{
	String grade;
	String score(int score){
		
			if(score<= 100 && score >= 90 ) {
				grade = "A";
			}else if(score< 90 && score >= 80) {
				grade ="B";
			}else if(score< 80 && score >= 70){
				grade = "C";
			}else if(score< 70 && score >= 60) {
				grade = "D";
			}else{
				grade = "F";
			}
		return grade;
		
	}
}
public class BackJun_If_02 {
	
	public static void main(String args[]) {
		
		String grade;
		score scr = new score();
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		grade = scr.score(score);
		System.out.println( grade );
				
		
	}
}
