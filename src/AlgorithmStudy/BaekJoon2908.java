package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon2908
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		// StringBuilder는 문자열을 다루는 클래스로 많이 쓰인다.
		// StringBuilder 생성과 동시에 append()라는 메소드에 값을 넣어준다.
		// StringBuilder 타입에서 String타입으로 바꿔주고 마지막에 int로 타입을 변경해준다.
		System.out.println(A > B ? A : B);
		
		sc.close();
	}

}
