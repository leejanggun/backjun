package backjun_Array;

import java.util.Scanner;
import java.util.ArrayList;

public class BackJun_Array2 {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A*B*C;
		boolean flag = true;
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		int i =0;		
		while(flag) {
			arrayList.add(mul % 10);  
			mul /=10;
			if(mul == 0) 
				flag =false;
			i++;
		}
		for(int k =0;k<10;k++) {
			int num=0;
			for(int j = 0; j< arrayList.size();j++) {
				if(arrayList.get(j) == k) {
					num++;
				}
			}
			System.out.println(k +" ÀÇ °¹¼ö´Â " + num);
		}
	}
}
