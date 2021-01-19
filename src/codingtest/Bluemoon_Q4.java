package codingtest;

import java.util.Scanner;

public class Bluemoon_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n번째 피보나치 수열 구하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n-1));
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}

}
