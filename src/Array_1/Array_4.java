package Array_1;
//백준 3052

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Array_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int idx = 0;
		
		int[] intArr = new int[10];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(idx<10) {
			intArr[idx] = Integer.parseInt(reader.readLine())%42;
			idx++;
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < intArr.length; i++) {
			if(!intList.contains(intArr[i])) {
				intList.add(intArr[i]);
			}
		}
		System.out.println(intList.size());
	}
}