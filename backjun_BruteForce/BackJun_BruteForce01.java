package backjun_BruteForce;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


class BlackJack{
	public int count, cardNum, sum, tmp;
	Scanner sc = new Scanner(System.in);
	int[] card;
	void input(){
		cardNum = sc.nextInt();
		count = sc.nextInt();
		blackJack();
	}
	void blackJack() {
		card = new int[cardNum];
		for(int i =0 ;i<cardNum;i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		win();
	}
	void win() {
		for(int i = 0;i<cardNum-2;i++) {
			for(int j=i+1;j<cardNum-1;j++) {
				for(int k=j+1;k<cardNum;k++) {
					tmp=card[i]+card[j]+card[k];
					if(tmp<=count && sum<tmp) {
						sum = tmp;
					}
				}
			}
		}
		System.out.println(sum);
	}
	
}
public class BackJun_BruteForce01 {

	public static void main(String[] args) {
		BlackJack blackjack = new BlackJack();
		blackjack.input();
	}
}
