package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2562
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 담아줌
		}
		
		int max = 0; // 최대값
		int index = 0; // 최대값의 index
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}
}
