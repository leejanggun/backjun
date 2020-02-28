package backjun_String;

import java.util.Scanner;

public class BackJun_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num =sc.next();
		for(int i= 0 ; i< num.length();i++) {
			System.out.println((int)num.charAt(i));
		}
	}

}
