package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_10818_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int i = 0;
		int[] arr = new int[num];
		
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			i++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[num-1]);
	}

}
