package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 윈도우 합 + 나머지
// 원래 배열 따로 생성하지 않고
// 바로 합 배열 생성

public class prob10986 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 숫자의 개수 n, 나누는 수 m 입력받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		long[] S = new long[n+1]; 	// 합 배열
		long[] R = new long[m+1]; 	// 나머지 배열

		// 합 배열 구하기
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}

		long result = 0; // 개수 세기
		for (int i = 1; i <= n; i++) {
			// 나머지
			int remainder = (int) (S[i] % m);

			// 나머지가 0이면 카운트하기
			if (remainder == 0)
				result++;

			// 나머지가 같은 인덱스의 개수 카운트하기
			R[remainder]++;
		}

		/*
		// 나머지 배열 출력하기
		for (int i = 0; i < m; i++) {
			System.out.println("나머지: " + i + ": " + R[i]);
		}
		*/
		
		// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 구하기
		for (int i = 0; i < m; i++) {
			if (R[i] > 1) // 나머지가 1보다 크면
			{
				// R[i] C 2 (combination)
				result = result + R[i] * (R[i] - 1) / 2; 
			}
		}
		System.out.println(result);

	}
}