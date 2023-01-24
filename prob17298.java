package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 스택
public class prob17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[N];	// 수열 배열
		int[] answers = new int[N];	// 정답 배열
		
		String[] str =  br.readLine().split(" ");	// 공백 기준으로 나누기
		for (int i=0; i<N; i++)
		{
			numbers[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);	// 처음에는 항상 스택이 비어있으므로 최초 값을 push해서 초기화
		
		for(int i=1; i<N; i++)
		{
			// 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while(!myStack.isEmpty() && numbers[myStack.peek()] < numbers[i] )
			{
				answers[myStack.pop()] = numbers[i];
				// 정답 배열에 오큰수를 현재 수열로 저장하기
			}
			myStack.push(i);	// 신규 데이터 push
			// 수열의 값이 아닌 index 저장
		}
		
		while(!myStack.empty())
		{
			// 반복문을 모두 돌고 나왔는데
			// 스택이 비어있지 않다면 빌 때까지
			answers[myStack.pop()] = -1;
			// 스택에 쌓인 index에 -1을 넣고
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N; i++)
		{
			bw.write(answers[i] + " ");
			// 출력하기
		}
		bw.write("\n");
		bw.flush();
	}

}


/*
 * 시간 초과
 * public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 수열의 크기 N
		
		
		int[] numbers = new int[N];
		for (int i=0; i<N; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++)
		{
			int now = numbers[i];
			int okensu = -1;
			
			for(int k=i+1; k<N; k++)
			{
				if (now < numbers[k]) {
					okensu = numbers[k];
					break;
				}
			}
			System.out.println(okensu);
		}
	}
 */

