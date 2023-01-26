package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 그리디 알고리즘
// 현재 상태에서 보는 선택지 중 최선의 선택지가 
// 전체 선택지 중 최선의 선택지라고 가정하는 알고리즘

// 그리디 알고리즘 수행 과정
// 1. 해 선택: 현재 상태에서 가장 최선이라고 생각되는 해를 선택한다.
// 2. 적절성 검사: 현재 선택한 해가 전체 문제의 제약 조건에 벗어나지 않는지 검사한다.
// 3. 해 검사: 현재까지 선택한 해 집팝이 전체 문제를 해결할 수 있는 지 검사한다.
// 			 전체 문제를 해결하지 못한다면 1로 돌아가 같은 과정을 반복한다.

// 우선 순위 큐
// 카드 묶음의 카드으 개수가 작은 순서 대로 먼저 합치기
public class prob1715 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 카드 묶음 수 N 입력받기
		int N = Integer.parseInt(st.nextToken());
		
		// 그리디 알고리즘 구현을 위한
		// 카드 묶음 우선순위 큐 초기화 및 입력받기 (오름차순)
		PriorityQueue<Integer> cards = new PriorityQueue<>();
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			int C = Integer.parseInt(st.nextToken());
			cards.add(C);
		}
		

		int result = 0;
		// 우선순위 큐 안에 든 카드묶음 개수가 1개가 될 때까지 반복
		while(cards.size() != 1)
		{
			int A = cards.remove();
			int B = cards.remove();
			
			result = result + (A + B);
			cards.add(A+B);
		}
		System.out.println(result);
	}
	


}
