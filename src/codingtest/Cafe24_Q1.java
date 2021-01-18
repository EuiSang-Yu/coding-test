package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cafe24_Q1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int inputNum = Integer.parseInt(input);
		
		for(int i=0; i<inputNum; i++){
			for(int j=1; j<inputNum-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<(i*2)+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
