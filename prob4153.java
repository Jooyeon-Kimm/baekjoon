package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

// 직각삼각형 여부 확인
public class prob4153 {	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] triangle = new int[3];
		
		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			triangle[0] = Integer.parseInt(st.nextToken());
			triangle[1] = Integer.parseInt(st.nextToken());
			triangle[2] = Integer.parseInt(st.nextToken());
			
			// 크기 순 정렬
			Arrays.sort(triangle);
			
			int a = triangle[0];
			int b = triangle[1];
			int c = triangle[2];
			
			// 0 0 0을 입력받으면 종료
			if(a == 0 && b == 0 && c == 0)
			{
				break;
			}
			
			
			if((a*a + b*b) == (c*c))
			{
				System.out.println("right");
			}
			else
			{
				System.out.println("wrong");
			}
			
		}
	}
}
		
		

