/*
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
package AlgorithmStudy;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_1330
{
	public static void main(String[] args) throws IOException
	{
		
//		  Scanner sc = new Scanner(System.in);
//		  
//		  int A = sc.nextInt(); int B = sc.nextInt();
//		  
//		  if(A > B) { System.out.println(">"); } else if(A < B) {
//		  System.out.println("<"); } else { System.out.println("=="); }
//		  
//		  sc.close();
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A > B) { 
			System.out.println(">"); 
		} else if(A < B) {
			System.out.println("<"); 
		} else { 
			System.out.println("=="); 
		}
	}
}
