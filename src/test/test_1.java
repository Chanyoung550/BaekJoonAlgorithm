package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(reader.readLine());
		
		int num1 = Integer.parseInt(token.nextToken());
		
		int[][] intArr = new int[num1][num1];
		
		int num2 = Integer.parseInt(token.nextToken());
		
		for(int i = 0; i < num1; i++) {
			int n = 0;
			token = new StringTokenizer(reader.readLine());
			for(int j = 0; j < num1; j++) {
				n += Integer.parseInt(token.nextToken());
				intArr[i][j] = n;
			}
		}
		
		for(int i  = 0; i < num2; i++) {
			
			token = new StringTokenizer(reader.readLine());
			int sum = 0;
			
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			int d = Integer.parseInt(token.nextToken());
			
			//System.out.println(a + " " + b + " " + c + " " + d);
			
			for(int j = a-1; j < c-1; j++) {
				System.out.println(j+ "번 " + intArr[j][num1-1]);
			}
			//System.out.println(sum);
		}
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer token = new StringTokenizer(reader.readLine());
//		
//		int num1 = Integer.parseInt(token.nextToken());
//		
//		int[][] intArr = new int[num1][num1];
//		
//		int num2 = Integer.parseInt(token.nextToken());
//		
//		int[][] intArr2 = new int[num2][4];
//		
//		for(int i = 0; i < num1; i++) {
//			token = new StringTokenizer(reader.readLine());
//			for(int j = 0; j < num1; j++) {
//				intArr[i][j] = Integer.parseInt(token.nextToken());
//			}
//		}
//		
//		for(int i  = 0; i < num2; i++) {
//			token = new StringTokenizer(reader.readLine());
//			for(int j = 0; j < 4; j++) {
//				intArr2[i][j] = Integer.parseInt(token.nextToken());
//			}
//		}
//		
//		int sum = 0;
//		
//		for(int i = 0; i < num2; i++) {
//			for(int j = intArr2[i][0]-1; j <= intArr2[i][2]-1; j++) {
//				for(int k = intArr2[i][1]-1; k < num1; k++) {
//					if(intArr2[i][3] != k && intArr2[i][2] != j) {
//
//						sum += intArr[j][k];
//					}
//				}
//			}
//			System.out.println(sum);
//			sum = 0;
//		}
	}
	
}
