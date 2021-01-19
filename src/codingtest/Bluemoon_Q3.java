package codingtest;

import java.math.BigInteger;

public class Bluemoon_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger big = new BigInteger("1");
		
		for(int i=1; i<=50; i++) {
			if(i%2 == 0) {
				big = big.multiply(BigInteger.valueOf(i));
				System.out.println(big);
			}
		}
	}

}
