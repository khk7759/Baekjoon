package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1546
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextDouble();
		}
		
		// 최대값구하기 1
//		int max = arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
		// 최대값구하기 2
		Arrays.sort(arr);
//		System.out.println(arr[arr.length - 1]);
		
		double max = arr[arr.length - 1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]/max * 100;
		}
		
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = sum/arr.length;
		
		System.out.println(avg);
		
		
		sc.close();
	}
}
