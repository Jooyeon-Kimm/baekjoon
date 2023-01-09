package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 에라토스테네스의 체
// 소수 구하기
public class prob1929 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// M 이상 N 이하의 자연수
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		// 배열
		int size = N + 1; // 큰 수보다 1 크게, 인덱스 1부터 시작하므로
		int[] A = new int[size];

		// 배열 초기화하기
		for (int i = 2; i <= N; i++) 
		{
			A[i] = i;
		}

		// 에라토스테네스의 체
		// 1은 소수가 아니므로 2부터 시작해서 마지막 수의 제곱근까지
		for (int i = 2; i <= Math.sqrt(N); i++) 
		{
			if (A[i] == 0) // 지워진 수이면
			{
				continue;
			}

			// 배수 지우기
			for (int k = i + i; k <= N; k = k + i)
			{
				A[k] = 0;
			}
		}
		
		// 소수 출력하기
		for (int i = M; i <= N; i++) 
		{
			if(A[i] != 0)
			{
				System.out.println(A[i]);
			}
		}

		br.close();
	}
}
