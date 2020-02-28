package backjun_Math1;

import java.util.Scanner;

class Calculate_Sugar{
	Scanner sc = new Scanner(System.in);
	int bag3, bag5;
	void calc(){
		int weight = sc.nextInt();
		boolean flag =true;
		while(flag) {
			if((weight%5)==0) {
				flag = false;
				bag5 = weight/5;
			} else {
				weight -=3;
				bag3++;
			}
			if(weight <0) {
				System.out.println(-1);
				flag=false;
			}
		}
		if(weight >=0) {
			System.out.println(bag5+bag3);
		}

	}
}
public class BackJun_Math1_02 {

	public static void main(String[] args) {  
		Calculate_Sugar calculate = new Calculate_Sugar();
		calculate.calc();
	}

}