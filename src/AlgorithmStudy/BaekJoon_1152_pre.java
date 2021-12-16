package AlgorithmStudy;

import java.util.StringTokenizer;

public class BaekJoon_1152_pre
{

	public static void main(String[] args)
	{
		/*
			StringTokenizer
			java.util 패키지
			하나의 문자열을 여러개의 문자열로 분리하기 위해 사용
			문자열을 분리할 때 사용되는 기준 문자를 구분 문자라고 하고 구분 문자로 분리된 문자열을 토큰이라고 한다.
		*/
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		// 문자 "&"를 기준으로 query 문자열을 여러 토큰으로 분리하는 코드
		// 객체 st는 분리된 3개의 문자열 토큰을 내장하고 있다.
		
		int count = st.countTokens(); // 분리된 토큰이 몇 개의 토큰으로 분리되었는지 알기 위한 메소드
		String token = st.nextToken(); // 토큰을 하나씩 얻기 위한 메소드
		
		System.out.println(count);
		System.out.println(token);
		for(int i=0; i<count; i++) {
			System.out.println(token);
		}
		for(int i=0; i<count; i++) {
			//String token1 = st.nextToken();
			//System.out.println(token1);
			//Exception in thread "main" java.util.NoSuchElementException
			//예외가 발생했다고 하는데 그것은 마지막 코드인 tokenizer.nextToken();이다.
			//따라서 nextToken() 메소드를 사용하기 전에는 
			//반드시 if(객체.hasMoreTokens()) 또는 if(객체.countTokens() > 0)으로 체크해보고 토큰을 뽑아야 한다.
			
			if(st.hasMoreTokens()) {	// 스트링토크나이저에 다음 토큰이 있으면 true 리턴
				String token1 = st.nextToken();
				System.out.println(token1);
			}
		}
	}

}
