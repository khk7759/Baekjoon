package AlgorithmStudy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon_1152
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine(); 
		// next()는 문자 혹은 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력을 받는다.
		// nextLine()의 경우에는 문자 혹은 엔터를 치기 전가지의 문장 전체를 입력을 받는다.
		
		StringTokenizer st = new StringTokenizer(S, " ");
		
		int C = st.countTokens();
		
		System.out.println(C);
		
//		for(int i=0; i<C; i++) {
//			if(st.hasMoreTokens()) {
//				String
//			}
//		}
		
		sc.close();
	}
}
