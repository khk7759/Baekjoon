package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_10950
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 0;
		
		for(i = 0; i < num; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
			
		}
		
		sc.close();
	}

}
