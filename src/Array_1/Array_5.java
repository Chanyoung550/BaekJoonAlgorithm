package Array_1;

/*
백준 1546번 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 0;
		
		int arrLen = 0;
		
		float[] floatArr = null;
		
		String[] strArr;
		
		boolean chk = true;
		
		float sumRes = 0;
		
		while(chk) {
			if(idx == 0) {
				arrLen = arrLen + Integer.parseInt(reader.readLine());
				floatArr = new float[arrLen];
				idx++;
			}
			else {
				String str = reader.readLine();
				strArr = str.split(" ");
				for(int i = 0; i < strArr.length; i++) {
					floatArr[i] = Integer.parseInt(strArr[i]);
				}
				Arrays.sort(floatArr);
				float max = floatArr[floatArr.length-1];
				
				for(int i = 0; i < floatArr.length; i++) {
					sumRes = sumRes + floatArr[i]/max*100;
				}
				float res = sumRes/arrLen;
				System.out.println(res);
				chk = false;
			}
		}
		
	}
}
