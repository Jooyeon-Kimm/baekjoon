package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 슬라이딩 윈도우
public class prob12891 {
	
	static int[] ACGT_min = new int[4];   // A, C, G, T 의 최소 개수 조건
	static int[] ACGT_check = new int[4]; // A, C, G, T 개수를 체크하는 배열
	static int satisfied; // A, C, G, T 의 최소 개수 조건 충족했는지 확인하는 변수
						  // 4개 모두 만족해서 satisfied == 4이면, result 1 증가
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// DNA 문자열의 길이 S, 비밀번호로 사용할 부분 문자열의 길이 P 입력받기
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		// char형 배열
		char[] DNA = new char[S];

		// 결과 카운트
		int result = 0;
		
		// 문자열 입력 받고, 문자열을 char형 배열로 변경하기
		DNA = br.readLine().toCharArray();

		// 부분문자열에 포함되어야 할 {‘A’, ‘C’, ‘G’, ‘T’} 의 최소 개수 입력받기
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			ACGT_min[i] = Integer.parseInt(st.nextToken());
			if(ACGT_min[i] == 0) satisfied++;
		}


		// 초기 P 부분 문자열 처리
		for (int i = 0; i < P; i++) {
			add(DNA[i]);
		}
		
		if (satisfied == 4)
		{
			result++;
		}

		// 슬라이딩 윈도우
		for (int i = P; i < S; i++) {			
			add(DNA[i]); // 다음 원소 추가
			remove(DNA[i-P]); // 맨 처음 원소 삭제

			if (satisfied == 4) 
			{
				result++;
			}
		}
		
		System.out.print(result);
		br.close();
	}
	
	
	// 추가되는 문자를 처리하는 함수
	private static void add(char c) 
	{
		switch(c)
		{
		case 'A': 
			ACGT_check[0]++; 
			if (ACGT_check[0] == ACGT_min[0]) 
				satisfied++;
			break;
			
		case 'C': 
			ACGT_check[1]++; 
			if (ACGT_check[1] == ACGT_min[1]) 
				satisfied++;
			break;
			
		case 'G': 
			ACGT_check[2]++; 
			if (ACGT_check[2] == ACGT_min[2]) 
				satisfied++;
			break;

		case 'T': 
			ACGT_check[3]++; 
			if (ACGT_check[3] == ACGT_min[3]) 
				satisfied++;
			break;

		}
	}

	// 추가되는 문자를 처리하는 함수
	private static void remove(char c) 
	{
		switch(c)
		{
		case 'A': 
			if (ACGT_check[0] == ACGT_min[0]) 
				satisfied--;
			ACGT_check[0]--; 
			break;
			
		case 'C': 
			if (ACGT_check[1] == ACGT_min[1]) 
				satisfied--;
			ACGT_check[1]--; 
			break;
			
		case 'G': 
			if (ACGT_check[2] == ACGT_min[2]) 
				satisfied--;
			ACGT_check[2]--; 
			break;

		case 'T': 
			if (ACGT_check[3] == ACGT_min[3]) 
				satisfied--;
			ACGT_check[3]--; 
			break;
		}
	}
}
