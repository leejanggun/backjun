package backjun_For;

import java.util.Scanner;

class Calculate{
	void calculate(int arr[], int size) {
		int num =0;
		for(int i = 0; i< size ; i+=2) {
			num= arr[i]+arr[i+1];
			System.out.println(num);
		}
		
	}
}

public class BackJun_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = 2*num;
		int arr[] = new int[size];
		for (int i = 0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		calc.calculate(arr, size);
		
	}

}
