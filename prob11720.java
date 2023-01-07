package Test;
import java.util.Scanner;

// 첫째 줄에 숫자의 개수가 주어지고
// 둘째 줄에 공백 없이 주어지는 숫자 N개의 합계를 구하여 출력하는 문제

public class prob11720 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        String numStr = sc.next(); // 숫자를 문자열로 입력받기
        char[] numChar = numStr.toCharArray(); // String형을 char[] 형으로 변환
        
        int sum = 0;
        for(int i=0; i< n; i++){
            int num = numChar[i] - '0'; // char[] 형을 int 형으로 변환하면서 더하기
            sum += num;
        }
		System.out.print(sum);
	}
}