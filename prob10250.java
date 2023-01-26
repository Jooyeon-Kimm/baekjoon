package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// ACM 호텔
// 왼쪽 아래에서 오른쪽 위로 차례대로 채우기

public class prob10250 {	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// T 개의 테스트 데이터, T 입력받기
		int T = Integer.parseInt(st.nextToken());
		
		
		for(int i=0; i<T; i++)
		{
			st = new StringTokenizer(br.readLine());
			//  H, W, N 세 정수 입력받기 
			//  호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			// 방 번호는 YXX 나 YYXX 형태인데 
			// 여기서 Y 나 YY 는 층 수를 나타내고 
			// XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 
			
			int Y = N % H;
			
			int X = (N / H) + 1;
			if (Y == 0) 
			{
				Y = H;
				X = N / H;
			}
			
			
			if (X < 10)	// X가 한 자리 수이면
			{
				System.out.println(Y+""+"0"+X);
			}
			else	// X 가 두 자리 수이면
			{
				System.out.println(Y+""+X);
			}
			
		}
		
		
	}

}