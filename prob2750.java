package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 버블 정렬
public class prob2750 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 숫자의 개수 N 입력받기
		int N = Integer.parseInt(st.nextToken());

		// 배열
		int[] A = new int[N];
		
		// 배열에 N개의 수 입력받기
		for(int i=0; i<N; i++) 
		{
			st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬하기
		// Arrays.sort(A);
		
		// 버블 정렬
		for (int i = 0; i<N-1; i++)
		{
			for(int k = 0; k < N-1 -i; k++)
			{
				if(A[k] > A[k+1])
				{
					int tmp = A[k];
					A[k] = A[k+1];
					A[k+1] = tmp;
				}
			}
		}
		
		// 정렬된 배열 출력하기
		for(int i=0; i<N; i++) 
		{
			System.out.println(A[i]);
		}
		br.close();
		
		
	}
}