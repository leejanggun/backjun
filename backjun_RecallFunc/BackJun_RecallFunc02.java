package backjun_RecallFunc;

import java.util.Scanner;

class Fibonacci{
	int[] fibonacci = new int[100];
	
	int sum(int a,int b) {
		return a+b;
	}
	int fibonacci(int num) {
		fibonacci[0]=0;
		fibonacci[1]=1;
		for(int i=2;i<=num ;i++) {
			fibonacci[i] = sum(fibonacci[i-1],fibonacci[i-2]);
		}
		return fibonacci[num];
	}
}

public class BackJun_RecallFunc02 {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println(fibonacci.fibonacci(sc.nextInt()));
	}

}
