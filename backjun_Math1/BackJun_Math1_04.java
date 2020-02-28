package backjun_Math1;

import java.util.Scanner;


class Calculate_Fountain{
	
	Scanner sc = new Scanner(System.in);
	int cnt ;
	int i=1 ;
	void calc(){
		boolean flag = true;
		int num = sc.nextInt();
		while(flag) {
			cnt +=i;
			if(num<cnt) {
				flag =false;
			}else {
				i++;
			}
		}
		int a =cnt -num;
		if(i%2 ==0) {
			System.out.println((i-a+1)+"/"+(a+1));
		}else {
			System.out.println(a+"/"+(a-i));
		}
		
	}
}

public class BackJun_Math1_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate_Fountain calculate = new Calculate_Fountain();
		calculate.calc();
		}
}
