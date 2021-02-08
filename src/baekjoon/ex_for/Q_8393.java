package baekjoon.ex_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q_8393 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 문제 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		 * 
		 * 출력 1부터 n까지 합을 출력한다.
		 * 
		 * 예제 입력 1 3 예제 출력 1 6
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);

		// ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
