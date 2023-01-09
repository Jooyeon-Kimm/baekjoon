package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 투 포인터
public class prob1253 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 숫자의 개수 N 입력받기
		int N = Integer.parseInt(st.nextToken());

		// 배열
		int[] A = new int[N];
		
		// 배열에 N개의 수 입력받기
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) 
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬하기
		Arrays.sort(A);
		
		
		int sum = 0; // 두 수의 합
		int count = 0; // 결과
		
		for(int i = 0; i<N; i++)
		{
			int find = A[i]; // find는 배열의 i번째 수
			int start_index = 0; // 시작 인덱스
			int end_index = N-1; // 끝 인덱스
			
			// System.out.println("find = " + find);
			// 투 포인터 알고리즘
			while(start_index < end_index) // 시작 인덱스가 끝 인덱스보다 작을 때까지
			{
				sum = A[start_index] + A[end_index];
	
				if(sum == find) // 합과 find가 같으면서
				{
					if(start_index != i && end_index != i)
					{
//						System.out.println("sum = find = " + sum);
//						System.out.println("start_index =" + start_index);
//						System.out.println("end_index =" + end_index);
						count++;
						break;
					}
					
					else if (start_index == i)
					{
						start_index++;
					}
					
					else if (end_index == i)
					{
						end_index--;
					}
				}
				
				else if(sum > find) // 합이 find보다 크면
				{
					end_index--;
				}
				
				
				else if(sum < find) // 합이 find보다 작으면
				{
					start_index++;
				}			
			}
			// System.out.println("count = " + count + "\n");
		}
		System.out.print(count);
		br.close();
		
		
	}
}