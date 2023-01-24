package Test;

import java.io.IOException;
import java.util.Scanner;

// 선택 정렬
// 최댓값 찾아서 SWAP

public class prob1427 {
	public static void main(String[] args) throws IOException {
		// Scanner로 String으로 입력받기
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// String을 Integer[]로 형 변환
		int[] numbers = new int[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{
			numbers[i] = Integer.parseInt(str.substring(i, i+1));	// string[i]
		}
		
		// 선택정렬
		for(int i=0; i<str.length(); i++)
		{
			int max = i;
			for(int k= i+1; k<str.length(); k++)
			{
				// 내림차순이므로 최댓값 찾기
				if(numbers[max] < numbers[k])
				{
					max = k;
				}
			}
			
			// 현재 i 값과 max 값 중
			// max 값이 더 크몬 swap 수행하기
			if(numbers[i] < numbers[max])
			{
				int temp = numbers[max];
				numbers[max] = numbers[i];
				numbers[i] = temp;
			}
		
		}
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(numbers[i]);
		}
		
	}

}


