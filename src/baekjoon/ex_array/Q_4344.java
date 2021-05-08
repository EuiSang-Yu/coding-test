package baekjoon.ex_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Q_4344 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * 평균은 넘겠지
		 * 
		 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		 * 
		 * 입력 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * 
		 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
		 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 출력 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 * 
		 * 예제 입력 1 5 5 50 50 70 80 100 7 100 95 90 80 70 60 50 3 70 90 80 3 70 90 81 9
		 * 100 99 98 97 96 95 94 93 91 예제 출력 1 40.000% 57.143% 33.333% 66.667% 55.556%
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int C = Integer.parseInt(str);
		List<String> arr = new ArrayList<String>(); // 모든 입력값
		for (int i = 0; i < C; i++) {
			// bw.append(i + "\n");
			arr.add(br.readLine());
		}

		List<Integer> avgChk = new ArrayList<Integer>();
		int sum;
		int overChk;
		double pers;

		for (int i = 0; i < C; i++) {
			int count = Integer.parseInt(arr.get(i).split(" ")[0]);
			sum = 0;
			overChk = 0;
			pers = 0;
			for (int j = 1; j < count + 1; j++) {
				sum += Integer.parseInt(arr.get(i).split(" ")[j]);
			}
			int tmp = sum / count;
			avgChk.add(tmp);
			for (int k = 1; k < count + 1; k++) {
				// 평균보다 높은 사람 찾기
				if (avgChk.get(i) < Integer.parseInt(arr.get(i).split(" ")[k])) {
					overChk++;
				}
			}
			// pers = (overChk + 0.000) / count;
			// pers = pers * 100;
			// DecimalFormat df = new DecimalFormat("#.###");
			// String resPers = df.format(pers);
			// result.add(resPers);
			System.out.printf("%.3f", 100.0 * overChk / count);
			System.out.println("%");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
