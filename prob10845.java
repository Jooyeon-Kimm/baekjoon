package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

// 큐
// Scanner로 입력받으면 시간 초과
// BufferedReader 이용해야 합니다

public class prob10845 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 명령의 수 N 입력받기
		
		// 연결 리스트로 구현한 큐
		Queue<Integer> myQ = new LinkedList<>();
		int last = 0; // 큐의 가장 뒤에 있는 정수
		
		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			
			if(order.equals("push"))
			{
				int num = Integer.parseInt(st.nextToken());
				myQ.add(num);
				last = num;	// 마지막 수는 num
			}
			
			else if (order.equals("pop"))
			{
				if(myQ.isEmpty())
				{
					System.out.println("-1");
				}
				else
				{
					System.out.println(myQ.poll());
				}
			}
			
			else if (order.equals("size"))
			{
				System.out.println(myQ.size());
			}
			
			else if (order.equals("empty"))
			{
				if(myQ.isEmpty())
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("0");
				}
			}
			
			else if (order.equals("front"))
			{
				if(myQ.isEmpty())
				{
					System.out.println("-1");
				}
				else 
				{
					System.out.println(myQ.peek());
				}
			}
			
			else if (order.equals("back"))
			{
				if(myQ.isEmpty())
				{
					System.out.println("-1");
				}
				else 
				{
					System.out.println(last);
				}
			}
		}
	}

}