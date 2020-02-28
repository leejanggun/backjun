package backjun_Array;

import java.util.Scanner;

public class BackJun_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int maxValue =0, lineValue = 0;
		
		for(int i =0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		for(int i =0; i<arr.length;i++) {
			if(maxValue<arr[i]) {
				maxValue = arr[i];
				lineValue = i+1;
			}
		}
		System.out.println(maxValue);
		System.out.println(lineValue);
	}

}
