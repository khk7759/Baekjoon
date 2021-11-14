package AlgorithmStudy;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class BaekJoon_10951
//{
//	public static void main(String[] args) throws IOException
//	{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st;
//		String str;
//		
//		while((str=br.readLine()) != null) {
//			st = new StringTokenizer(str, " ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			System.out.println(a+b);
//
//		}
//		br.close();
//	}
//
//}

import java.util.Scanner;

public class BaekJoon_10951
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);

		}
		sc.close();
	}

}