package baekjoon.ex_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		문제
		
		두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		
		입력
		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		출력
		첫째 줄에 A-B를 출력한다.
		
		예제 입력 1 
		3 2
		예제 출력 1 
		1
		 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int [] arr = new int[str.length()];
		
		for(int i=0; i<str.split(" ").length; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		System.out.println(arr[0] - arr[1]);
		
		
	}

}
