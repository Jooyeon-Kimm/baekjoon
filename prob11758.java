package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
	CCW (counter-clockwise)
	CCW는 평면상의 3개의 점과 관련된 점들의 위치 관계를 판단하는 알고리즘
	벡터의 외적에 대한 이해가 필요하다.
	공식은: CCW = (x1*y2 + x2*y3 + x3*y1) - (x2*y1+x3*y2+x1*y3)
	기하에서 가장 기본이 되므로 암기하면 좋다.
	
	CCW > 0 : 세 점이 반시계 방향
	CCW = 0 : 세 점이 일직선
	CCW < 0 : 세 점이 시계 방향
	
	CCW 결과의 절댓값은 세 점의 벡터의 외적값을 나타내고
	CCW 결과의 절댓값을 절반으로 나누면 세 점으로 이뤄진 넓이를 나타낸다
*/

public class prob11758 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 세 점 입력받기 P1(x1, y1), P2(x2, y2), P3(x3, y3) 
		int x1, y1, x2, y2, x3, y3;
		x1 = Integer.parseInt(st.nextToken());
		y1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		x2 = Integer.parseInt(st.nextToken());
		y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		x3 = Integer.parseInt(st.nextToken());
		y3 = Integer.parseInt(st.nextToken());
		
		int CCW = (x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3);
		
		// 반시계 방향이면 1, 시계 방향이면 -1, 일직선이면 0을 출력하기
		if (CCW > 0) System.out.println("1");
		else if (CCW < 0) System.out.println("-1");
		else System.out.println("0");
	}
	
	

}
