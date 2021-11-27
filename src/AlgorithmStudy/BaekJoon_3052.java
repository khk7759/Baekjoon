package AlgorithmStudy;

import java.util.Scanner;

public class BaekJoon_3052
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int count = 0;
		boolean flag;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i=0; i<arr.length; i++) {
			flag = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
		
		

//		for(int i=0; i<arr.length; i++ ) {
//			bl = false; //기본값을 false로 설정
//			for(int k=i+1; k<arr.length; k++ ) {
//				if( arr[i] == arr[k] ) { //배열의 n번째와 n+1번째의 값을 비교
//					bl = true; //같다면 bl값을 true로 변경
//					break; //한번만 비교하면 되니 조건이 성립하면 벗어나기
//				}
//			}
//			if( bl == false ) {
//				cnt ++; //bl의 값이 false일 때 카운트를 1증가
//			} //만약 true면 나머지가 서로 같다는 뜻이니 카운트를 올릴 필요x
//		}
	}

}
