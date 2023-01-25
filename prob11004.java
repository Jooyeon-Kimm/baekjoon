package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class prob11004 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 수의 개수 N, M번째 수, 수 배열 A
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		// A 배열에 N개의 수를 입력받기
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정렬하기
		Arrays.sort(A);
		
		// 배열의 M번째 원소 출력하기
		System.out.println(A[M-1]);
	}
	
	

}
