package kr.or.kosa;

public class HelloLog {
	
	public static void log() {
		System.out.println(">>>>부가기능<<<< : " + new java.util.Date());
	}
	
	public void exceptionLog(){
		System.out.println("[예외처리] 비즈니스 로직 수행 중 예외 발생");
	}

	public void afterReturningLog() {
		System.out.println("[After-Returning] 비즈니스 로직 정상 수행 후 동작");
	}
}
