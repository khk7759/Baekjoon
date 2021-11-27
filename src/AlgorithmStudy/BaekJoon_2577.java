package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2577
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int A = Integer.parseInt(br.readLine());
//		int B = Integer.parseInt(br.readLine());
//		int C = Integer.parseInt(br.readLine());
		
//		int result = A * B * C;
		int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//		System.out.println(result);
		
		String str = String.valueOf(result);
		
		int[] arr = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++; //arr[0]라는 변수안에 들어있는 수를 ++ 하겠다는 뜻...
		}
		
		for (int v : arr) {
			System.out.println(v);
		}
		
//		for(int i=0; i<10; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 혹은 scanner 사용 -- 가장 보편적인 방법, 시간복잡도가 O(N^2) => 좋은 코드 아님
		// charAt 을 쓸때는 -'o' 혹은 -48 을 연산한다. => 아스키코드에서 'o'가 48임 꼭 해줘야함
//		Scanner sc = new Scanner(System.in);
//		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
//		
//		String str1 = Integer.toString(value); // 문자형 숫자변환 (Integer.toString(), String.valueOf())
//		
//		for(int i=0; i<10; i++) {
//			int count = 0;
//			for(int j=0; j<str1.length(); j++) {
//				if((str1.charAt(j) - 48) == i) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
	}
}
