package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 윈도우 합
// 구간 합 구하는 문제
// 이차원으로 확장

public class prob11660 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 이차원 배열의 크기 n, 합을 구해야 하는 횟수 m 입력받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] A = new int[n + 1][n + 1]; // 원래 배열
		int[][] S = new int[n + 1][n + 1]; // 합 배열

		// 원래배열 입력받기
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int k = 1; k <= n; k++) {
				A[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		// 합 배열 구하기
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				S[i][k] = S[i][k-1] + S[i-1][k] - S[i-1][k-1] + A[i][k];
			}
		}

		/*
		// 합 배열 출력하기
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				System.out.print(S[i][k] + " ");
			}
			System.out.println();
		}
		*/
		
		// 좌표 m쌍 받기
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			int result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
			System.out.println(result);
		}

	}
}