package baekjoon.ex_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2739 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		문제
		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		
		입력
		첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		출력
		출력형식과 같게 N*1부터 N*9까지 출력한다.
		
		예제 입력 1 
		2
		예제 출력 1 
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		 
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		for (int i = 1; i < 10; i++) {
			System.out.println(N+" * "+i+" = "+(N*i));
		}
		
	}

}