package backjun_Array;

import java.util.Scanner;
import java.util.ArrayList;

public class BackJun_Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(true) {
			int size = sc.nextInt();
			ArrayList<String> arrayStringList = new ArrayList<String>();
			flag = true;
			while(flag) {
				int total =0;
				int cnt =0;
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				for(int i =0 ; i < size; i++) {
					arrayList.add(sc.nextInt());
				}
				for(int i =0 ;i<size; i++) {
					total += arrayList.get(i);
				}
				int aver = total/size;
				
				for(int i=0 ; i<size ;i++) {
					if(arrayList.get(i) >aver) 
						cnt ++;
				}
				double per = (double)(cnt*100)/size; 
				String str = String.format("%.3f", per);
				arrayStringList.add(str);
				System.out.println(str+"%");
				flag =false;
			}
		}
	}

}
