package AlgorithmStudy;

public class BaekJoon_2908_pre
{

	public static void main(String[] args)
	{
		// StringBuffer, StringBuilder
		
		//String 은 내부의 문자열을 수정할 수 없다.
		//String의 replace() 메소드는 내부의 문자를 대치하는 것이 아니라, 대치된 새로운 문자열을 리턴한다.
		//String 객체를 + 연산할 경우에도 마찬가지다.
		String data = "ABC";
		data += "DEF";
		
		// 한 개의 String 객체가 사용되었다고 생각할 수도 있지만
		// String 객체는 내부 데이터를 수정할 수 없으므로 "ABCDEF"라는 새로운 String 객체가 생성된다.
		// data 변수는 새로 생성된 String 객체를 참조하게 된다.
		// 문자열을 결합하는 + 연산자를 많이 사용하면 할수록 그만큼 String객체의 수가 늘어나기 때문에
		// 프로그램 성능을 느리게 하는 요인이 된다.
		// 문자열을 변경하는 작업이 많을 겨웅네는 STring 클래스를 사용하는 것보다
		// StringBuffer, StringBuilder 클래스를 사용하는 것이 좋다.
		// 이 두 클래스는 내부 버퍼에 문자열을 저장해두고, 그 안에서 추가, 수정, 삭제 작업을 할 수 있도록 설계되어 있다.
		// String 처럼 새로운 객체를 만들지 않고도 문자열을 조작할 수 있는 것이다.
		// StringBuffer 와 StringBuilder 의 사용방법은 동일한데 
		// 차이점은 StringBuffer 는 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용되어 있어 스레드에 안전하지만
		// StringBuilder는 단일 스레드 환경에서만 사용하도록 설계되어 있다.
	}

}
