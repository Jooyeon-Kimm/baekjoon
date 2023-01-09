package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 버블 정렬 응용
public class prob1377 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 숫자의 개수 N 입력받기
		int N = Integer.parseInt(st.nextToken());

		// 배열
		myData[] A = new myData[N];
		
		// 배열에 N개의 수 입력받기
		for(int i=0; i<N; i++) 
		{
			st = new StringTokenizer(br.readLine());
			A[i] = new myData(Integer.parseInt(st.nextToken()), i);
		}
		
		// 오름차순으로 정렬하기, O(logn)의 시간복잡도
		Arrays.sort(A);
		
		int max = 0;
		for(int i=0; i<N; i++)
		{
			// 정렬전 index - 정렬 후 index
			int difference = A[i].index - i;
			
			// difference 의 최댓값 저장하기
			if (max < difference) 
			{
				max = difference;
			}
		}
		System.out.println(max+1);
		br.close();
	}
}

// 값과 인덱스를 가지는 myData 클래스
class myData implements Comparable<myData>
{
	int value;
	int index;
	
	public myData(int value, int index)
	{
		super();
		this.value = value;
		this.index = index;
	}
	

	// value 기준 오름차순 정렬하기
	@Override
	public int compareTo(myData o)
	{
		return this.value - o.value;
	}
}

/*
 * [Comparable] docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#method.summary
 * Comparable 인터페이스에는 
 * compareTo 메소드 하나가 선언되어있다.
 * Comparable을 사용하고자 한다면 
 * compareTo 메소드를 재정의(Override/구현)를 해줘야 한다. 
 */

/* 
 * 추가
 * https://st-lab.tistory.com/243
 * Comparable과 Comparator의 차이?
 * 
 * Comparable은 "자기 자신과 매개변수 객체를 비교"한다.
 * Comparator는 "두 매개변수 객체를 비교"한다.
 */

