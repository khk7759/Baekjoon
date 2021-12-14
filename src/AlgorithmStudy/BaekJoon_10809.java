package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_10809
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(S.indexOf(i) + " ");
		}

	}

}
