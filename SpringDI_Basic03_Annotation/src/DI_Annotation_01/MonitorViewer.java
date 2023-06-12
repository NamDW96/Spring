package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
	private Recorder recorder;

	
	public Recorder getRecorder() {
		return recorder;
	}
	
	
	/*
	 xml 설정에서
	 		<property name="recorder">
				<ref bean="recorder" />
			</property>
	Annotation으로
	
	 
	@Autowired
	-> 컨테이너 안에 빈객체들이 생성되고 .... 주입 ..... @Autowiredd 만나면 .... 
	컨테이너 안에 Recorder 타입 빈객체를 찾고 있으면 자동주입..
	
	>>aop jar 파일 추가
	>> @Autowired 정상 동작하지 않는 경우
	  */
	
	
	//MonitorViewer 는 recorder에 의존한다 .... 필요해요 ... , 주소가 필요해요...
	
	//@Autowired (required = true) >> default >> 무조건 injection
	//@Autowired (required = false) >> 컨테이너 안에 원하는 타입의 객체가 없으면 주입안하면 된다.
	
	
	@Autowired
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
	}
	
	
}
