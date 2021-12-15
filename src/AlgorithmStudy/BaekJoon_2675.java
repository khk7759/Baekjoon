package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_2675
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			// 각 문자를 R번 반복해
			int R = sc.nextInt();
			// 문자열 S를 입력 받음
			String S = sc.next();
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
