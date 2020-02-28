package backjun_Math1;

import java.util.Scanner;

class Calculate_Hexagon{
	int num=1;int i=2;
	boolean flag = true;
	Scanner sc= new Scanner(System.in);
	void calc(){
		int req = sc.nextInt();
		while(flag) {
			if(req == 1) {
				flag =false;
				System.out.println((i));
			}else {
				num += 6*i;
				i++;
				if(req <= num) {
					flag = false;
					System.out.println(i);
				}
			}
		}
	}
}
public class BackJun_Math1_03 {

	public static void main(String[] args) {
		Calculate_Hexagon calculate = new Calculate_Hexagon();
		calculate.calc();
	}
}
