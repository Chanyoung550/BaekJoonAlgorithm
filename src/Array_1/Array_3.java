package Array_1;

/*
백준 2577번
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_3 {

	public static void main(String[] args) throws IOException {
		
		int[] intArr = new int[3];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 0;
		
		while(idx < 3) {
		
			int in = Integer.parseInt(reader.readLine());
			intArr[idx] = in;
			idx++;
			
		}

		int intRes = intArr[0]*intArr[1]*intArr[2];
		
		String strRes = Integer.toString(intRes);
		
		int[] res = new int[10];
		
		idx = 0;
		while(idx < strRes.length()) {
			switch(strRes.substring(idx, idx+1)) {
			    case "0": 
			    	res[0] = res[0]+1;
			        break;
			    case "1": 
			    	res[1] = res[1]+1;
			        break;
			    case "2":
			    	res[2] = res[2]+1;
			    	break;
			    case "3":
			    	res[3] = res[3]+1;
			    	break;
			    case "4":
			    	res[4] = res[4]+1;
			    	break;
			    case "5":
			    	res[5] = res[5]+1;
			    	break;
			    case "6":
			    	res[6] = res[6]+1;
			    	break;
			    case "7":
			    	res[7] = res[7]+1;
			    	break;
			    case "8":
			    	res[8] = res[8]+1;
			    	break;
			    case "9":
			    	res[9] = res[9]+1;
			    	break;
			}
			idx++;
		}
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
