package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BaekJoon_10818_3
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000001;
		int min = 100001;
		
		int i = 0;
		int[] arr = new int[num];
		
		while(st.hasMoreTokens()) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		System.out.print(min + " " + max);
	}

}
