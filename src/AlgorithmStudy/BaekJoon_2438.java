package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2438
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int starN = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=starN; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		br.close();
	}

}
