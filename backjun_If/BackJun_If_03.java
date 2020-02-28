package backjun_If;

import java.util.Scanner;

class leap{
	
	int calc(int year){
		int num_4 = year % 4;
		int num_100 = year % 100; 
		int num_400 = year % 400;
		if( num_4 == 0 ) {
			if(num_100 == 0) {
				if(num_400 == 0) {
					return 1;
				}else {
				return 0;
				}
			}else {
				return 1;
			}
		}
		return 0;
	}
}

public class BackJun_If_03 {

	public static void main(String[] args) {
		
		int year;
		leap lp = new leap();
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.println(lp.calc(year));
		
		
	}

}
