package test;

public class test_2 {
	
	public static void main(String[] args) {
		
		int num = 23;
		
		int digitCount = Integer.toString(num).length();

	    if (num < 0) 
	        digitCount--;           

	    int[] result = new int[digitCount];

	    while (digitCount-- >0) {
	        result[digitCount] = num % 10;
	        num /= 10;
	    }
	    for(int res : result) {
	    	System.out.println(res);
	    }
	}

}
