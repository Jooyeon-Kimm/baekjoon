package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 그리디 알고리즘
// 은행 기다리는 시간 가작 작은 것 부터
// 삽입 정렬
public class prob11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 사람 수 N 입력받기
		int N = Integer.parseInt(st.nextToken());

		// 사람 배열 people 객체 생성 후 입력받기
		st = new StringTokenizer(br.readLine(), " ");
		int[] people = new int[N];
		for (int i = 0; i < N; i++) 
		{
			people[i] = Integer.parseInt(st.nextToken());
		}

		// 삽입정렬 O(n^2)
		// 인덱스 0은 이미 정렬된 것으로 볼 수 있다.
		for (int i = 1; i < N; i++) 
		{
			int insert_point = i;			// 삽입할 값의 인덱스
			int insert_value = people[i];	// 삽입할 값
			
			// 현재 범위에서 삽입 위치 찾기
			for (int k = i - 1; k >= 0; k--) 
			{
				if (insert_value > people[k]) // 삽입할 값이 이전 데이터보다 클 때
				{
					insert_point = k + 1;	// 삽입 위치는 이전 데이터 바로 뒤
					break;
				}

				if (k == 0) // k가 0일 때는
				{
					insert_point = 0;	// 삽입 위치는 0
				}
			}
			
			// 삽입 위치에서 i까지 데이터를 한 칸씩 뒤로 밀기
			for (int k = i; k > insert_point; k--) 
			{
				people[k] = people[k - 1];
			}
			
			// 삽입 위치에 현재 데이터 삽입하기
			people[insert_point] = insert_value;
		}

//		// 정렬된 값 출력하기
//		for (int i = 0; i < N; i++) 
//		{
//			System.out.println(i + ":" + people[i]);
//		}

		// 합 배열 만들기
		// 공식: S[i] = A[i] + S[i-1];
		int[] sum = new int[N];
		sum[0] = people[0];

		// 합 배열 구하면서, 모든 원소의 합 구하기
		int total = sum[0];	// 모든 원소의 합
		for (int i = 1; i < N; i++) {
			sum[i] = people[i] + sum[i - 1];
			total = total + sum[i];
		}

		System.out.println(total);
	}

}
