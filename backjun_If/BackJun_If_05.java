package backjun_If;

import java.util.Scanner;

class Compare{
	int compare(int A, int B, int C){
		if(A > B && B > C ) {
			return B;
		}else if(A > C && C > B ) {
			return C;
		}else if(B > C && C > A ) {
			return C;
		}else if(B > A && A > C ) {
			return A;
		}else if(C > B && B > A ) {
			return B;
		}else  {
			return A;
		}
	}//compare
}//Compare

public class BackJun_If_05 {

	public static void main(String[] args) {
		
		int A, B, C;
		Compare compare = new Compare();
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		System.out.println(compare.compare(A, B, C));
	}

}

