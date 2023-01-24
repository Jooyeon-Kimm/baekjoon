package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// 무방향 그래프, 연결 요소의 개수 구하기
// 연결 요소 개수 = DFS 호출 수

public class prob11724 {
	static ArrayList<Integer>[] A;	// 배열 리스트 A
	static boolean visited[];		// 방문 확인 배열
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N_node = Integer.parseInt(st.nextToken());	// 노드 개수
		int N_edge = Integer.parseInt(st.nextToken());  // 에지 개수
				
		A = new ArrayList[N_node+1];
		visited = new boolean[N_node+1];
		
		// A 인접 리스트의 각 ArrayList 초기화 하기
		for(int i=1; i<=N_node; i++)
		{
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<N_edge; i++)
		{
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			// 양방향 에지 이므로, 양쪽에 에지를 더하기
			A[start].add(end);
			A[end].add(start);
		}
		
		int count = 0;
		for(int i=1; i<=N_node; i++)
		{
			if(visited[i] == false)	// 방문하지 않은 노드가 없을 때까지 방문
			{
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	// 재귀 함수, 깊이 탐색
	static void DFS(int vertex)
	{
		if (visited[vertex])	// 이미 방문한 vertex 이면
		{
			return;	// 종료
		}
		
		visited[vertex] = true;	// 방문으로 바꾸기
		
		// 인접 정점들에 대해 재귀 호출
		for(int i: A[vertex])
		{
			if(visited[i] == false)	// 연결 노드 중 방문하지 않았던 노드만 탐색하기
			{
				DFS(i);
			}
		}
	}

}