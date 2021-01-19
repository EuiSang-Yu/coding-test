package codingtest;

import java.util.Scanner;

public class Bluemoon_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String [] str = new String[5];
		String temp;
		int i,j;
		
		for(i=0; i<5; i++) {
			str[i] = sc.next();
		}
		
		for(i=0; i<4; i++) {
			for(j=i+1; j<5; j++) {
				//compareTo a<b 이면 음수리턴 아스키코드
				
				if(str[i].compareTo(str[j]) < 0) { // str[i] 가 더 작으면 
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		for(i=0; i<5; i++) {
			System.out.println(str[i]);
		}
	}

}
