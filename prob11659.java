package Test;
import java.util.Scanner;

// 윈도우 합
// 구간 합 구하는 문제

public class prob11659 {

	public static void main(String[] args) 
	{
		// 숫자 개수 n과 합을 구해아 하는 수 m 입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[] A = new long[n+1];	// 숫자 배열
		long[] S = new long [n+1];	// 합 배열
      
		// 숫자 입력받기
		for(int i=1; i<=n; i++)
		{
			A[i] = sc.nextInt();
		}
		
		// 합 배열 만들기
		S[1] = A[1];
       for(int i =2; i<=n; i++)
       {
    	   S[i] = A[i] + S[i-1];
       }
       
       for(int i=0; i<m; i++) {
    	   int start = sc.nextInt(); // 시작 인덱스
    	   int end = sc.nextInt(); // 끝 인덱스
    	
    	   System.out.println(S[end]-S[start-1]);
       }
       
	}
}