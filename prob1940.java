package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투 포인터
public class prob1940 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 재료의 개수 N, 갑옷을 만드는 데 필요한 수 M 입력받기
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		
		// 재료들을 담을 배열
		int[] A = new int[N];
		
		// 배열에 재료들을 입력받기
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) 
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 재료들을 오름차순으로 정렬하기
		Arrays.sort(A);
		
		int sum = 0; // 두 재료의 합
		int count = 0; // 결과
		int start_index = 0; // 시작 인덱스
		int end_index = N-1; // 끝 인덱스
		
		while(start_index < end_index) // 시작 인덱스가 끝 인덱스보다 작을 때까지
		{
			sum = A[start_index] + A[end_index];
			
			if(sum == M) // 합과 M이 같으면
			{
				count++;
				start_index++;
				end_index--;
			}
			
			else if(sum > M) // 합이 M보다 크면
			{
				end_index--;
			}
			
			
			else if(sum < M) // 합이 M보다 작으면
			{
				start_index++;
			}			
		}
		
		System.out.print(count);
		
		
		
	}
}