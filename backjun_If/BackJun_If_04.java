package backjun_If;

import java.util.Scanner;

class Time{
	void time(int H, int min){
		if(H == 0) {
			if(min < 45 ) {
				H = 23;
				min += 15;
				System.out.println(H + " " + min);
			}else {
				min -= 45;
				System.out.println(H + " " + min);
			}
		}else {
			if(min < 45 ) {
				H -=1;
				min += 15;
				System.out.println(H + " " + min);
			}else {
				min -= 45;
				System.out.println(H + " " + min);
			}
		}
		
		
	}
}

public class BackJun_If_04 {

	public static void main(String[] args) {
		
		int H, min;
		Scanner sc = new Scanner(System.in);
		Time time = new Time();
		H = sc.nextInt();
		min = sc.nextInt();
		time.time(H, min);
	}

}
