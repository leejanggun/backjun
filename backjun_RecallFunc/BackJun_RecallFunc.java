package backjun_RecallFunc;

import java.util.Scanner;

class RecallFunction{
	int recall(int i){
		if( i ==0)
			return 1;
		else
			return i * recall(i-1);
	}
}
public class BackJun_RecallFunc {

	
	public static void main(String[] args) {
		RecallFunction recallfunction = new RecallFunction();
		Scanner sc = new Scanner(System.in);
		System.out.println(recallfunction.recall(sc.nextInt()));
	}

}
