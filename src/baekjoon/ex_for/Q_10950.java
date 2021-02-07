package baekjoon.ex_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q_10950 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 문제 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 
		 * 출력 각 테스트 케이스마다 A+B를 출력한다.
		 * 
		 * 예제 입력 1 5 1 1 2 3 3 4 9 8 5 2 예제 출력 1 2 5 7 17 7
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			int a = Integer.parseInt(temp.split(" ")[0]);
			int b = Integer.parseInt(temp.split(" ")[1]);
			arrlist.add(a + b);
		}
		for (int j = 0; j < arrlist.size(); j++) {
			System.out.println(arrlist.get(j));
		}

	}

}
