/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��5��21�� ����1:53:33
 * ��������֮���ת��
 */
public class Test09 {

	public static void main(String[] args) {
		
		//byte��int
		
		byte b1 = 1;
		byte b2 = 2;
		
		int a = b1+b2;//����һ����С���ת���Ĺ���
		
		//int ��byte����ת��,ǿת
		
		int a1 = 127;
		
		int a2 = 128;
		
		byte a3 =(byte)(a1+a2);//���ȵĶ�ʧ. -128+127
		
		System.out.println(a);
		
		System.out.println(a3);
		
	}
	
}
