package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
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
			
			while(bol && j < n) {
				
				if(intArr[i] < intArr[j]) {
					intArr2[i] = intArr[j];
					bol = false;
					
				}
				else if(j >= n) {
					intArr2[i] = -1;
					bol = false;
				}
				j++;
			}
			if(intArr2[i]==0) {
				intArr2[i] = -1;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(intArr2[i]+" ");
		}
	}

}
