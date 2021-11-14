/*
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 첫째 줄에 A-B를 출력한다.
 */
package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_1001
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(a-b);
	}

}
