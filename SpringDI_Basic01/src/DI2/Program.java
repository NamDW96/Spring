package DI2;

public class Program {
	
	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 50, 40);
		//view.print();
		
		NewRecordView view = new NewRecordView();
		//NewRecord 객체 주소가 필요
		NewRecord record = new NewRecord(100,100,100);
		view.setRecord(record); //의존객체의 주소를 주입받는다.(DI) > spring 자동화 ....
		view.print();
	}
}
