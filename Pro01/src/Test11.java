import java.util.Scanner;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��5��20�� ����10:30:46
 */
public class Test11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double  wei = 	sc.nextDouble();
		
		int we = sc.nextInt();
		
		double IBM = we/(wei*wei);
		
		boolean z = (IBM>18.5)&&(IBM<23.9);
		
		System.out.println(z?"zhengchang":"buzhengchang");
		
	}
	
	
	

	

}
