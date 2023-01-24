package Test;

import java.io.IOException;
import java.util.Scanner;

// 브루트 포스 (Brute Force)
// 무차별 공격, 모든 경우의 수 모두 검사하기

public class prob1436 {
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int evilNumber = 666;
		int count = 1;
		 
		while(count != N) {
			evilNumber++;
		    
			// int형인 evilNumber를 String으로 변환한 후 
			// "666" 문자열이 있는지 검사하기
			if(String.valueOf(evilNumber).contains("666")) { 
				count++;
			}
		}
		System.out.println(evilNumber);
		
		
	}

}

/*
(1) 666

(2) 1666
(3) 2666
(4) 3666
(5) 4666
(6) 5666
(7) 6660
(8) 6661
(9) 6662
(10) 6663
(11) 6664
(12) 6665
(13) 6666
(14) 6667
(15) 6668
(16) 6669
(17) 7666
(18) 8666
(19) 9666

(20) 10666
(21) 11666
(22) 12666
(23) 13666
(24) 14666
(25) 15666
(26) 16660
(27) 16661
(28) 16662
(29) 16663
(30) 16664
(31) 16665
(32) 16666
(33) 16667
(34) 16668
(35) 16669
(36) 17666
(37) 18666
(38) 19666

(39) 20666
(40) 21666
(41) 22666
(42) 23666
(43) 24666
(44) 25666
(45) 26660
(46) 26661
(47) 26662
(48) 26663
(49) 26664
(50) 26665
(51) 26660
(52) 26661
(53) 26662
(54) 26663
(55) 26664
(56) 26665
(57) 26666
(58) 26667
(59) 26668
(60) 26669
(61) 27666
(62) 28666
(63) 29666

(64) 30666
*/