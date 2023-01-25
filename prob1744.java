package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
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

public class prob1744 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수열의 크기 N 입력받기
		int N = Integer.parseInt(st.nextToken());
		
		// 그리디 알고리즘 구현을 위한
		// 우선순위 큐 수열 초기화 및 입력받기
		// 양수, 음수, 0, 1 네 가지로 나눠서 입력받기
		PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());	// 양수는 내림차순으로
		PriorityQueue<Integer> negative = new PriorityQueue<>();	// 음수는 오름차순으로
		int zero = 0;	// 0의 개수
		int one = 0;	// 1의 개수
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			int data = Integer.parseInt(st.nextToken());
			
			// (주의) 1을 양수보다 먼저 검사해야 한다
			if (data == 1)
			{
				one++;
			}
			
			else if (data > 0)
			{
				positive.add(data);
			}
		
			
			else if (data == 0)
			{
				zero++;
			}
			
			else
			{
				negative.add(data);
			}
			
			
		}
		
		int sum = 0;
		// 1. 양수 큐에서 두 수는 곱하고 남는 수는 더하기
		while(positive.size() > 1)
		{
			int data1 = positive.remove();
			int data2 = positive.remove();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			
			sum = sum + (data1 * data2);
		}
		
		if(!positive.isEmpty())	// 양수 큐에 양수 하나가 남아있으면
		{
			sum = sum + positive.remove();
		}
		
		
		// 2. 음수끼리 곱해서 양수 만들기
		while(negative.size() >1)
		{
			int data1 = negative.remove();
			int data2 = negative.remove();
			
			sum = sum + (data1 * data2);
		}
		
		// 음수 큐에 수가 남아 있으면
		if(!negative.isEmpty())
		{
			if(zero == 0)
			{
				sum = sum + negative.remove();
			}
		}
		
		// 3. 1의 개수 더해주기
		sum = sum + one;
		
		// 결과 출력
		System.out.println(sum);
	}
	
	

}
