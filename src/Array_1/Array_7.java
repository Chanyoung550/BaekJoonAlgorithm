package Array_1;

/*
백준 4344번 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Array_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		
		int idx = 0;
		
		while(num > idx) {
			
			StringTokenizer tokStr = new StringTokenizer(reader.readLine());
			
			int len = Integer.parseInt(tokStr.nextToken());
			
			float[] floatArr = new float[len];
			
			float avg = 0;
			
			float sum = 0;
			
			float cnt = 0;
			
			for(int i = 0; i < len; i++) {
				
				float floatRes = Float.parseFloat(tokStr.nextToken());
				
				floatArr[i] = floatRes;
				
				sum += floatRes;
				
				if(i == len-1) {
					avg = sum/len;
				}
			}
			
			for(int i = 0; i < len; i++) {
				
				
				if(floatArr[i] > avg) {
					cnt++;
				}
			}
			
			float res = cnt / len * 100;
			System.out.print(String.format("%.3f", res));
			System.out.println("%");
			
			idx++;
		}
		
	}
	
}
