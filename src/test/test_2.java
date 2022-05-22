package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_2 {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[] intArr = new int[n];
		int[] intArr2 = new int[n];
		
		String str = reader.readLine();
		
		StringTokenizer token = new StringTokenizer(str);
		
		for(int i = 0; i < n; i++) {
			intArr[i] = Integer.parseInt(token.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			
			boolean bol = true;
			
			int j = i;
			
			while(bol) {
				
				if(intArr[i]<intArr[j]) {
					intArr2[i] = intArr[j];
					bol = false;
					
					j++;
				}
				else if(j >= n) {
					intArr2[i] = -1;
					bol = false;
				}
			}
			if(intArr2[i]==0) {
				intArr2[i] = -1;
				j++;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(intArr2[i]+" ");
		}
	}

}
