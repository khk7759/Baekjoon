package AlgorithmStudy;

import java.util.Scanner;

public class BaeJoon_1157
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 알파벳 개수
		
		String S = sc.next();
		
		for(int i=0; i<S.length(); i++) {
			if('A' <= S.charAt(i) && S.charAt(i) <= 'Z') {
				arr[S.charAt(i) - 'A']++;
			} else {
				arr[S.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
		
		sc.close();
	}

}
