package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

// 좌표 정렬하기
// 2차원 평면 위의 점 N개가 주어진다. 
// 좌표를 y좌표가 증가하는 순으로, 
// y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 
// 출력하는 프로그램을 작성하시오.

public class prob11651 {	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N개의 점, N 입력받기
		int N = Integer.parseInt(st.nextToken());
		
		// 좌표 배열
		int XY[][] = new int[N][2];
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			// 좌표 입력받기
			XY[i][0] = Integer.parseInt(st.nextToken());
			XY[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// Arrays.sort()에서 Comparator 인터페이스 사용
		Arrays.sort(XY, new Comparator<int[]>() 
		{
			public int compare(int[] A, int[] B) // Y좌표 비교
			{
				if( A[1] > B[1] )
				{
					return 1;
				}
				
				else if ( A[1] < B[1] ) 
				{
					return -1;
				}
				
				else // A[1] = B[1]
				{
					return A[0]-B[0];
				}
			}
		});
		
		//출력
		for(int i=0; i<N; i++) 
		{
			System.out.println(XY[i][0]+" "+XY[i][1]);
		}
	}

}