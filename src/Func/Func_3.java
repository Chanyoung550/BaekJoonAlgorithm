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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Func_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		sequence(n);

	}
	
	public static void sequence(int n) {
		
		int count = 0;
		
		int idx = 1;
		
		while(idx <= n) {
			if(idx < 100) {
				count++;
			}
			else {
				int[] intArr = d(idx);
				
				int arrSize = intArr.length;
				
				int[] intArr2 = new int[arrSize-1];
				
				
				for(int i = arrSize-1; i >= 0; i--) {
					if(i <= 0) {
						intArr2[i] = intArr[i]-intArr[i-1];
					}
					System.out.println(intArr2[i]);
				}
			}
			idx++;
		}
		
	}
	
	public static int[] d(int n){

		int nSize = Integer.toString(n).length();
		
		int[] intArr = new int[nSize];
		
		int idx = 0;
		
		while(n != 0) {
			
			int arrCol = n % 10;
			
			n = n/10;
			
			intArr[idx] = arrCol;
			
			System.out.println(arrCol);
			
			idx++;
		}
		return intArr;
	}

}
