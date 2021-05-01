package baekjoon.ex_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q_8958 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * OX퀴즈
		 * 
		 * 문제 "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그
		 * 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
		 * 
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * 
		 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이
		 * 주어진다. 문자열은 O와 X만으로 이루어져 있다.
		 * 
		 * 출력 각 테스트 케이스마다 점수를 출력한다.
		 * 
		 * 예제 입력 1 5 OOXXOXXOOO OOXXOOXXOO OXOXOXOXOXOXOX OOOOOOOOOO OOOOXOOOOXOOOOX 예제
		 * 출력 1 10 9 7 55 30
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 테스트 케이스 개수
		int[] result = new int[N];
		int prevScore = 0;

		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < N; i++) {
			prevScore = 0;
			if (arr[i].charAt(0) == 'O') {
				prevScore++;
				result[i]++;
			}
			for (int j = 1; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					if (arr[i].charAt(j - 1) == 'O') {
						prevScore += 1;
						result[i] += prevScore;
					} else {
						prevScore = 1;
						result[i] += prevScore;
					}
				} else {
					prevScore = 0;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		sc.close();
	}

}
