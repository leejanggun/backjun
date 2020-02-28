package backjun_For;

import java.util.Scanner;

class Gugudan{
	void gugudan(int num){
		
		for(int i = 1 ; i <10 ; i++) {
			System.out.println("[ "+ num+ " ]" + " * " + "[ "+ i+ " ]" + " = " + (num*i));
			
		}
		
	}
}
public class BackJun_For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Gugudan gugudan = new Gugudan();
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		gugudan.gugudan(num);
	}

}
