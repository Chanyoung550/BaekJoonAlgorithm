package Array_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		
		String[] strArr = new String[num];
		
		int idx = 0;
		
		while(num > idx) {
			strArr[idx] = reader.readLine();
			idx++;
		}
		for(int i = 0; i < strArr.length; i++) {
			int cnt = 0;
			int sum = 0;
			for(int j = 0; j < strArr[i].length(); j++) {
				//System.out.println(strArr[i].substring(j, j+1));
				if(strArr[i].substring(j, j+1).equals("O")) {
					cnt = cnt+1;
					sum = sum + cnt;
				}
				else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
