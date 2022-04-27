package Array_1;

/*
입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
3
29
38
12
57
74
40
85
61

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
85
8
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Array_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int max = 0;
		int idx = 0;
		int cnt = 0;
		int[] intArr = new int[9];
		while((str = reader.readLine()) != null) {
			intArr[idx] = Integer.parseInt(str);
			if(max < intArr[idx]) {
				max = intArr[idx];
				cnt = idx+1;
			}
			idx++;
			if(idx == 9) {
				System.out.println(max);
				System.out.println(cnt);
			}
		}
	}
}
