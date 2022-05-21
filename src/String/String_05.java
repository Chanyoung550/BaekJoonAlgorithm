package String;

/*
  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다. 
  
  첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
  
  첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
  
  Mississipi	?
  zZa			Z
  
  
 */


import java.util.Scanner;

public class String_05 {
	
	public static void main(String[] args) {
		
		int[] intArr = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i)-'A';
			intArr[num]++;
		}
		
		int max = 0;
		char res = '?';
		
		for(int i = 0; i < intArr.length; i++) {
			if(max < intArr[i]) {
				max = intArr[i];
				res = (char) (i+'A');
			}
			else if(max == intArr[i]) {
				res = '?';
			}
		}
		System.out.println(res);
	}
}
