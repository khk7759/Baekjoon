package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_4344
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); // 테스트 케이스 개수 C
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt(); // 학생 수 N
			
			int[] arr = new int[N];
			
			int sum = 0; // 합
			
			for(int j=0; j<N; j++) {
				int score = sc.nextInt(); // 점수
				arr[j] = score;
				sum += score;
			}
			
			double avg = sum/N;
			double cnt = 0;
			
			for(int j=0; j<N; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			
			double result = (cnt/N)*100;
			
			System.out.printf("%.3f", result);
			System.out.println("%");
			
		}
		sc.close();
	}
}
