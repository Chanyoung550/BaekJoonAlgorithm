package Func;

/*

어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

110	99
1	1
210 105

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Func_3 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		sequence(n);

	}
	
	public static void sequence(int n) {
		int cnt = 0;
		
		if(n < 100) {
			
			System.out.println(n);
			
		}
		else {
			cnt = 99;
			
			for(int i = 100; i <= n; i++) {
				int hund = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hund-ten)==(ten-one)) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}
		
	}

}
