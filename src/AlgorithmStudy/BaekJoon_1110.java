package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_1110
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tmp = n;
		int cnt = 0;
		
		do {
			n = ((n%10)*10) + (((n/10)+(n%10))%10);
			cnt++;
			
			System.out.println(n);
		}while(tmp != n);
		
		System.out.println(cnt);
		
		sc.close();
	}

}
