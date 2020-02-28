package backjun_String;

import java.util.Scanner;

public class BackJun_String3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String voca = sc.next();
		int arr[] = new int[voca.length()];
		int arrInt[] = new int[26];
		for(int i=0 ; i<voca.length();i++) {
			arr[i] = (int)(voca.charAt(i));
			for(int j = i+1 ; j<voca.length();i++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
			for(int i =0 ; i<26;i++) {
				arrInt[i] =-1;
				for(int j=0; j<arr.length; j++) {
					if(arr[j] != 0) {
						int num=arr[j]-96;
						arrInt[num] = j;
					}
				}
			}
		
		
	}

}
