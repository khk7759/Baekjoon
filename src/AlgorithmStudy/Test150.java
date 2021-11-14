package AlgorithmStudy;
import java.util.Stack;

public class Test150
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	// 생성자
	public Test150()
	{
		// st라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → <String>
		Stack<String> st = new Stack<String>();

		// st라는 Stack 자료구조에 데이터 담기
		// st = colors; // (X)
		for(String color : colors)
		{
			st.push(color);
		}

		st.push("보라");

		//st.push(10); 
		// 제네릭 표현식에 위배되기 때문에 적재할 수 없다. (10을 담을 수 없음.)
		//--==>> 에러 발생(컴파일 에러) 자바가 제네릭에 데이터를 확인하고 담기 때문에 런타임이 아닌 컴파일 에러가 발생
		//-- 제네릭 표현식을 통해 선언하고 있는
		//   String이 아닌 다른 자료형 (int 나 double)을 
		//   스택 st에 push() 하려고 했기 때문...

		// 출력 메소드 호출;
		popStack(st);
	}
	
	// 출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while(!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test150(); // 생성자 안에 모든 처리를 해놓았으므로 생성자만 호출해도 다 실행이 됨
	}
}
