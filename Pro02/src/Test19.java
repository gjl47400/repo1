import java.util.Scanner;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��5��21�� ����4:30:06
 */
public class Test19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//����һ��ɨ�����ȥ����̨��ɨ�����������
		
		System.out.println("�������������أ���������");
		
		int w = sc.nextInt();//�ڿ���̨�����һ��int���͵�ֵ����������
		
		System.out.println("�������������(С��)��");
		
		double h = sc.nextDouble();
		
		/*int weight = 70;
		
		double height = 1.75;*/
		
		double IMB = w/(h*h);
		
		System.out.println("������֬����:"+IMB);
		
		boolean result = (IMB>18.5)&&(IMB<23.7);
		
		String msg = result?"�����֬������":"����������Χ��";
		
		System.out.println(msg);
		
	}
	
	
}
