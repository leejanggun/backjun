package backjun_Array;

import java.util.Scanner;
import java.util.ArrayList;

public class BackJun_Array3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[10];
		int[] num = new int[10];
		int[] compArr = new int[10];
		int same = 0;
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			num[i] = arr[i]%42;
		}
		for(int i = 0; i < num.length; i++) {
			for(int j =i+1 ; j<num.length;j++) {
				if(num[i] == num[j]) 
					same++;
			}
		
	}
		System.out.println(same);
	}
}

//			for(int j = 0 ; j < num.length; i++) {
//				if(num[j]==compArr[i]) {
//					
//				}
//			}