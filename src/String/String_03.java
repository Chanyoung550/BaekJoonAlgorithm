package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
		
		for(int i = 0; i < 26; i++) {
			
			boolean res = true;
			
			char chr = (char) ('a'+i);
			
			String chrStr = String.valueOf(chr);
			int num = -1;
			
			for(int j = 0; j < str.length(); j++) {
				
				num = str.indexOf(chrStr);
				
			}
			System.out.print(num + " ");
		}

	}

}