package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 투 포인터
public class prob2018 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 정수 N 입력받기
		int N = Integer.parseInt(st.nextToken());
		
		int count = 1; // N 본인일 경우 포함
		int start_index = 1;
		int end_index = 1;
		int sum = 1; // 연속된 숫자의 합
		
		while (end_index != N) // 오른쪽 포인터가 N이 아닐 때까지
		{
			if (sum == N) // 연속합이 N과 같으면
			{
				count++;
				end_index++;
				sum = sum + end_index;
			}
			
			else if (sum > N) // 연속합이 N보다 크면
			{
				sum = sum - start_index;
				start_index++;
			}
			
			else if (sum < N) // 연속합이 N보다 작으면
			{
				end_index++;
				sum = sum + end_index;
			}

		}
		
		System.out.print(count);
	}
}