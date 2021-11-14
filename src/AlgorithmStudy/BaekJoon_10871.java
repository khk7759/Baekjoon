package AlgorithmStudy;

//import java.util.Scanner;
//
//public class BaekJoon_10871
//{
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		
//		int arr[] = new int[N];
//		
//		for(int i=0; i<N; i++) {
//			arr[i] = sc.nextInt();;
//		}
//		
//		sc.close();
//		
//		for(int i=0; i < N; i++) {
//			if(arr[i] < X) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//	}
//}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class BaekJoon_10871
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i < N; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}