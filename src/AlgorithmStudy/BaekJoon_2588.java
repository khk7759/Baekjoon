package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2588
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println(b/100); // 100의 자리
		System.out.println((b%100)/10); // 10의 자리
		System.out.println((b%100)%10); // 1의 자리
		
		System.out.println(a * ((b%100)%10));
		System.out.println(a * ((b%100)/10));
		System.out.println(a * (b/100));	
		System.out.println(a * b);
	}
}
