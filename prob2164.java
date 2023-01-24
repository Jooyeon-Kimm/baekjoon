package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 큐
public class prob2164 {
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 	// 카드의 개수 N 입력 받기
		
		// 카드 1부터 N까지 수 (1이 맨 위, N이 맨 아래)
		// 연결 리스트로 구현한 큐
		Queue<Integer>cards = new LinkedList<>();
		
		// 카드를 큐에 저장하기
		for(int i=1; i<=N; i++)
		{
			cards.add(i);
		}
		
		while(cards.size() > 1) // 카드가 1장 남을 때 까지
		{
			// 맨 앞의 카드를 버린다
			cards.poll();
			
			// 그 다음 가장 위에 있는 카드를 가장 아래에 있는 카드 밑으로 옮긴다
			cards.add(cards.poll());
		}
		
		System.out.print(cards.peek());
	}

}

/*
1. remove()
큐 맨 앞에 있는 값 반환 후 삭제
큐가 비어 있는 경우 NoSuchElementException 에러 발생

2. poll()
큐 맨 앞에 있는 값 반환 후 삭제
큐가 비어있을 경우 null 반환

3. clear()
큐 비우기
 */