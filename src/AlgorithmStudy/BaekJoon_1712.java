package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_1712
{

	public static void main(String[] args)
	{
		// a만원의 고정비용
		// b만원의 가변비용
		// c만원의 노트북가격
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// A + (B*i) < C*i
		// (C*i)-(B*i) > A
		// i(C-B) > A
		// i > A/(C-B)
		
//		if(C<=B) {
//			System.out.println("-1");
//		} else {
//			int i = 1;
//			while(true) {
//				if(i > A/(C-B)) {
//					break;
//				}
//				i++;
//			}
//			System.out.println(i);
//		}
// ----- 컴파일에러 개오래걸림
		
		if(C <= B) {
			System.out.println("-1");
		} else {
			System.out.println(A/(C-B) + 1);
		}
		
		sc.close();
		

	}

}
