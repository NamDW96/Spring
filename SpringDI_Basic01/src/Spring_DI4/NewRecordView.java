package Spring_DI4;

import java.util.Scanner;

//������ ����ϴ� Ŭ����
public class NewRecordView implements RecordView {
	//NewRecordView�� ������ �ޱ� ���ؼ� NewRecord�� �ʿ��մϴ�.
	//��� : ���� ** 
	
	private NewRecord record; //member field NewRecrod ��ü�� �ּҸ� �����ڴ�.

	//NewRecord ��ü�� �ּҸ� �ʿ信 ���� ���� �ް� ��
	//NewRecordView �� ��������ٰ� �ؼ� ������ record�� NewRecord ���� �ʿ�� ����.
	
	/*
	 * public NewRecordView(int kor, int eng, int math) { record = new
	 * NewRecord(kor, eng, math); }
	 */
	
	//���⸦ �����Ұ�
	//���� �Լ�
	//public void setRecord(NewRecord record) {
	public void setRecord(Record record) {
		this.record = (NewRecord)record;
	}
	/*
		���� �ϰ� �ʿ���
		���� ���� ��ü [�ּ�]�� �ʿ���
		
		1. �����ڸ� ���ؼ� �ʿ��� ��ü�� ���� �Ǵ� ���� > DI > ����, ����
		2. �Լ�(setter)�� ���ؼ� �ʿ��Ѥ� ��ü�� ���� > DI > ���� > �ʿ信 ����
		
	*/
	@Override
	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("kor");
		record.setKor(Integer.parseInt(sc.nextLine()));
		System.out.println("eng");
		record.setEng(Integer.parseInt(sc.nextLine()));
		System.out.println("math");
		record.setMath(Integer.parseInt(sc.nextLine()));
	}
	
}
