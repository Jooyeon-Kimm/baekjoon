package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

// 사람 나이 순으로 정렬하기
public class prob10814 {	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// N명의 사람 입력받기
		int N = Integer.parseInt(st.nextToken());

		// 사람 배열
		String[][] people = new String[N][2];

		for(int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine());
			// 나이와 이름 입력받기
			people[i][0] = st.nextToken();
			people[i][1] = st.nextToken();
		}

		// Arrays.sort()에서 Comparator 인터페이스 사용
		Arrays.sort(people, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

		//출력
		for(int i=0; i<N; i++) 
		{
			System.out.println(people[i][0]+" "+people[i][1]);
		}
	}

}