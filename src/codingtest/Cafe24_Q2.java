package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Cafe24_Q2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Scanner sc = new Scanner(System.in);
		String[] arr = input.split(" ");
		int [] arrN = new int[arr.length];
		int n, s;
		
		// 수열의 개수 n, 진행단계 s
		n = Integer.parseInt(arr[0]);
		s = Integer.parseInt(arr[1]);
		
		int [] arrList = new int[n];
		
		for(int i=0; i<n; i++) {
			arrList[i] = Integer.parseInt(sc.next());
		}
		
		int least, temp;
		
		for(int i=0; i<s; i++) {
			least = i;
			
			for(int j=i+1; j<n; j++) {
				if(arrList[j] < arrList[least]) {
					least = j;
				}
			}
			
			if(i != least) {
				temp = arrList[i];
				arrList[i] = arrList[least];
				arrList[least] = temp;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arrList[i]+" ");
		}
		
		
	}

}
