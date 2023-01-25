package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 그리디 알고리즘
// 현재 상태에서 보는 선택지 중 최선의 선택지가 
// 전체 선택지 중 최선의 선택지라고 가정하는 알고리즘

// 그리디 알고리즘 수행 과정
// 1. 해 선택: 현재 상태에서 가장 최선이라고 생각되는 해를 선택한다.
// 2. 적절성 검사: 현재 선택한 해가 전체 문제의 제약 조건에 벗어나지 않는지 검사한다.
// 3. 해 검사: 현재까지 선택한 해 집팝이 전체 문제를 해결할 수 있는 지 검사한다.
// 			 전체 문제를 해결하지 못한다면 1로 돌아가 같은 과정을 반복한다.
public class prob11047 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 동전의 개수 N 입력받기
		int N = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		// 동전 배열 초기화 및 입력받기
		int[] coins = new int[N];
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		int total = 0;	// 동전 개수
		for(int i = N-1; i>=0; i--)
		{
			if(money >= coins[i])	// 돈이 코인 단위보다 크거나 같으면
			{
				total = total + (money / coins[i]);	// 동전 개수 추가
				money = money % coins[i];			// 남은 돈
			}
		}
		System.out.println(total);

	}
	


}
