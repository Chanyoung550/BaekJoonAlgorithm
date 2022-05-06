package Func;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Func_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 0;
		
		int hour = 0;
		
		int min = 0;
		
		while(idx<2) {
			
			if(idx==0) {
				String str = reader.readLine();
				StringTokenizer token = new StringTokenizer(str);
				
				hour = Integer.parseInt(token.nextToken());
				min = Integer.parseInt(token.nextToken());
				
			}
			else {
				int addTime = Integer.parseInt(reader.readLine());
				
				if(min+addTime >= 60) {
					hour = hour + Math.round((min+addTime)/60);
					if(hour >= 24) {
						hour = hour % 24;
					}
					min = (min+addTime)%60;
				}
				else {
					min = min + addTime;
				}
				System.out.println(hour + " " + min);
			}
			
			idx++;
		}
	}

}
