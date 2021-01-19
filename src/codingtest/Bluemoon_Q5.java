package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Bluemoon_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 100까지 자연수중에 2의배수 또는 3의 배수이지만 5의배수는 아닌것
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) {
			if(i%5 != 0) {
				if(i%2==0 || i%3==0) {
					result.add(i);
				}
			}
		}
		
		System.out.println(result);
	}
}

