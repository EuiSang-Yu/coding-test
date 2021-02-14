package baekjoon.ex_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q_11021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * 문제 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 
		 * 출력 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 * 
		 * 예제 입력 1 5 1 1 2 3 3 4 9 8 5 2 예제 출력 1 Case #1: 2 Case #2: 5 Case #3: 7 Case
		 * #4: 17 Case #5: 7
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int T = Integer.parseInt(str);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		for (int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			int A = Integer.parseInt(temp[0]);
			int B = Integer.parseInt(temp[1]);
			arrlist.add(A + B);
		}
		for (int i = 0; i < arrlist.size(); i++) {
			bw.append("Case #" + (i + 1) + ": " + arrlist.get(i) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}
