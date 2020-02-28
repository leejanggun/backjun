package backjun_String;

import java.util.Scanner;

public class BackJun_String2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int size = sc.nextInt();
		String num = sc.next();
		for(int i = 0; i<size ;i++) {
			total += Integer.parseInt(Character.toString((num.charAt(i))));
		}
		System.out.println(total);
	}
}
