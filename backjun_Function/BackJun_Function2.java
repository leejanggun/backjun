package backjun_Function;

import java.util.ArrayList;

public class BackJun_Function2 {

	static int d(int n) {
		int i= 0;
		int total =0;
		boolean flag = true;
		if(n !=0) {
			while(flag) {
				total += (n%10);
				n = n/10;
				i++;
				if(n==0 && n/10 ==0)
					flag =false;
			}
		}
		n = n+total;
		return n;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i = 0; i<=100;i++) {
			arrList.add(i);
		}
		for(int i=1; d(i)<=100;i++) {
			for(int j = 0;j<=100;j++) {
				if(d(i)==arrList.get(j)) {
					arrList.set(j, 0);
				}
			}
		}
		for(int i=0; i<100;i++) {
			if(!(arrList.get(i)==0))
				System.out.println(arrList.get(i));
		}
	}

}
