package Array_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 입력 
 * 5
 * 20 10 35 30 7
 * 출력 
 * 7 35
 * */

public class Array_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int idx = 0;
		int max = 0;
		int min;
		while((str = reader.readLine()) != null) {
			
			int[] intArr = new int[Integer.parseInt(str)];
			
			if(intArr.length>0) {
				StringTokenizer st = new StringTokenizer(reader.readLine());

				while(st.hasMoreTokens()) {
					int temp = Integer.parseInt(st.nextToken());
					intArr[idx] = temp;
					idx++;
				}
				Arrays.sort(intArr);
				System.out.println(intArr[0] + " " + intArr[intArr.length-1]);
			}
		}
	}
	
}
