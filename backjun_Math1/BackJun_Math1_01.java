package backjun_Math1;

import java.util.Scanner;

class Calculate{
	Scanner sc = new Scanner(System.in);
	int basePrice, plusPrice,sales,cost;
	int i,profit ;
	public void calc() {
		basePrice = sc.nextInt();
		plusPrice = sc.nextInt();
		cost = sc.nextInt();
		if(plusPrice>=cost) {
			System.out.println(-1);
		}else {
			profit = cost -plusPrice;
			i =(basePrice/profit)+1;
			System.out.println(i);
		}
	}
}
public class BackJun_Math1_01 {
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.calc();
	}

}
