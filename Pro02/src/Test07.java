/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��5��21�� ����11:26:29
 * �������Ͳ���
 */
public class Test07 {

	
	public static void main(String[] args) {
		
		//float f = 3.14;  ���������ڶ����ʱ��Ĭ����double
		float f = 3.14f;
		
		double b = 6.28;
		double b1 = 6.28e3;
		
		double b2 = 10000000000.0;
		
		double b3 = 1.0;
		
		double b4 = b2+b3;
		
		float f1 = 0.1f;
		double d1 = 1.0/10;
		//�������Ͳ���ȷ������־��ȶ�ʧ�����⣬ǧ��Ҫ���ڱȽ�
		if(f1==d1) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
		
		System.out.println(b4);
		
	}
	
}
