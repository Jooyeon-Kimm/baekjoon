package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 신기한 소수 (DFS)
public class prob2023 {
	static int N;
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 자리수 N 입력받기
		N = Integer.parseInt(st.nextToken());
		
		// 한 자리 소수는 2, 3, 5, 7 이므로
		// 4개의 수에서만 시작
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);

	}
	
	// 깊이 우선 탐색 (일의 자리 수, 자리 수)
	static void DFS(int number, int jarisu)
	{
		if(jarisu == N)
		{
			if(isPrime(number))
			{
				System.out.println(number);
			}
			return;
		}
		
		for(int i=1; i<10; i++)
		{
			if( i % 2 == 0)	// 짝수이면 더 이상 탐색할 필요가 없음
			{
				continue;
			}
			
			if (isPrime(number*10 + i))	// 소수라면 재귀 함수로 자릿수를 늘림
			{
				DFS(number*10+i, jarisu+1);
			}
		}
		
	}
	
	// 소수 확인 함수
	static boolean isPrime(int number)
	{
		for(int i=2; i<= number/2; i++)
		{
			if( number % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

}
