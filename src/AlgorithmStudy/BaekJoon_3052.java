package AlgorithmStudy;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_3052
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[10];
//		int count = 0;
//		boolean flag;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt() % 42;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			flag = false;//기본값을 false로 설정
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] == arr[j]) {//배열의 n번째와 n+1번째의 값을 비교
//					flag = true;//같다면 bl값을 true로 변경
//					break;//한번만 비교하면 되니 조건이 성립하면 벗어나기
//				}
//			}
//			if(flag == false) {
//				count++;//bl의 값이 false일 때 카운트를 1증가
//			}//만약 true면 나머지가 서로 같다는 뜻이니 카운트를 올릴 필요x
//		}
//		System.out.println(count);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(sc.nextInt()%42);
		}
		
		System.out.println(hs.size());
		
		sc.close();
	}

}
/*
JAVA HashSet
Set 인터페이스의 구현 클래스
Set의 성질을 그대로 상속받는다
Set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있으며 저장 순서가 유지되지 않는다.
Set 인터페이스를 구현한 클래스로는 HashSet과 TreeSet이 있는데
HashSet의 경우 정렬을 해주지 않고 TreeSet의 경우 자동정렬을 해준다는 차이점이 있다.
Set의 가장 큰 장점은
중복을 자동으로 제거해준다는 점이다.
Set은 비선형 구조이기에 순서가 없으며 그렇기에 인덱스도 존재하지 않는다.
그렇기에 값을 추가하거나 삭제할 때에는 
내가 추가 혹은 삭제하고자 하는 값이 Set 내부에 있는지 검색한 뒤 추가나 삭제를 해야 하므로
속도가 List구조에 비해 느리다.
*/