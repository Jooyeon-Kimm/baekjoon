package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * DFS 깊이 우선 탐색
 * 친구 관계 파악하기
A 와 B 는 친구다.
B 와 C 는 친구다.
C 와 D 는 친구다.
D 와 E 는 친구다.
 */
public class prob13023 {	
	
	// 친구 배열
	static ArrayList<Integer>[] Friends;
	
	// 방문 여부 확인 배열
	static boolean visited[];
	
	// 깊이 5 도달 여부 확인
	static boolean arrived;
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 노드 개수, 에지 개수 입력받기
		int nodes = Integer.parseInt(st.nextToken());
		int edges = Integer.parseInt(st.nextToken());
		
		visited = new boolean[nodes];
		arrived = false;
		
		Friends = new ArrayList[nodes];
		for (int i=0; i<nodes; i++)
		{
			Friends[i] = new ArrayList<Integer>();
		}
		
		// 점 양방향으로 연결
		for (int i=0; i<edges; i++)
		{
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			Friends[S].add(E);
			Friends[E].add(S);
		}
		
		
		// 깊이 우선 탐색하기
		for(int i=0; i<nodes; i++)
		{
			DFS(i, 1);	// depth 1부터 시작
			
			if(arrived == true)
			{
				break;
			}
		}
		
		// 출력하기
		if(arrived == true)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
	
	// DFS 함수
	public static void DFS(int now, int depth)
	{
		if (depth == 5 || arrived == true)
		{
			arrived = true;
			return;
		}
		
		visited[now] = true;
		
		for(int i: Friends[now])
		{
			if(visited[i] == false)
			{
				DFS(i, depth+1);
			}
		}
		
		visited[now] = false;
	}
}
		
		

