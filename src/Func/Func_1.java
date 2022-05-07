package Func;


public class Func_1 {
	
	public long test(int[] a) {
		
		long sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum = sum + Long.valueOf(a[i]);
		}
		
		return sum;
	}
	
}
