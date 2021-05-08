package baekjoon.ex_function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_15596 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * 정수 N개의 합
		 * 
		 * Java: long sum(int[] a); (클래스 이름: Test) a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤
		 * a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000) 리턴값: a에 포함되어 있는 정수 n개의 합
		 */
		int[] arr = { 1, 2, 3 };
		sum(arr);
	}

	static long sum(int[] a) {
		long ans = 0;
		for (int tmp : a) {
			ans += tmp;
		}
		return ans;
	}
}
