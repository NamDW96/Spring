package DI2;

public class Program {
	
	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 50, 40);
		//view.print();
		
		NewRecordView view = new NewRecordView();
		//NewRecord ��ü �ּҰ� �ʿ�
		NewRecord record = new NewRecord(100,100,100);
		view.setRecord(record); //������ü�� �ּҸ� ���Թ޴´�.(DI) > spring �ڵ�ȭ ....
		view.print();
	}
}