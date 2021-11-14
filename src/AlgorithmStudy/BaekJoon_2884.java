package AlgorithmStudy;

import java.util.*;

public class BaekJoon_2884
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45) {
			System.out.println(H + " " + (M - 45));
		} else {
			H -= 1;
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + (M + 15));
		}
		
		sc.close();
	}

}
