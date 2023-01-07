package Test;
import java.util.Scanner;

// 새로운 정의의 평균을 구하는 문제

public class prob1546 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		
      
        // 점수 입력 받기 + 최대 점수 찾기
        int max = 0;
        for(int i=0; i<n; i++) 
        {
        	numbers[i] = sc.nextInt();
        	if(numbers[i] > max) 
        	{
        		max = numbers[i];
        	}      
        }

        // 점수 모두 더하기
        long sum = 0;
        for(int i=0; i<n; i++) 
        {
        	sum += numbers[i];
        }
        
        // 점수를 조작한 후 새로운 평균 출력하기
        double average;
        average = (sum * 100.0 / max) / n;
        System.out.println(average);
	}
}