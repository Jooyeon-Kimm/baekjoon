package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 윈도우 합
// 구간 합 구하는 문제

public class prob11659_bufferedReader {

	public static void main(String[] args) throws IOException
	{
		// 숫자 개수 n과 합을 구해아 하는 수 m 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] S = new long [n+1];	// 합 배열
		
		st = new StringTokenizer(br.readLine());
       for(int i =1; i<=n; i++)
       {
    	   S[i] = S[i-1] + Integer.parseInt(st.nextToken());
       }
       
       for(int i=0; i<m; i++) {
    	   st=new StringTokenizer(br.readLine());
    	   int start = Integer.parseInt(st.nextToken()); // 시작 인덱스
    	   int end = Integer.parseInt(st.nextToken()); // 끝 인덱스
    	
    	   System.out.println(S[end]-S[start-1]);
       }
       
	}
}