package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_2292
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int route = 1;
		int range = 2;
		
		if(N == 1) {
			System.out.println(1);
		} else {
			while(range <= N) {
				range = range + (6*route);
				route++;
			}
			System.out.println(route);
			
		}

		sc.close();
	}

}
