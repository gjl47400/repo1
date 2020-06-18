import java.util.Scanner;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 下午4:30:06
 */
public class Test19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//创建一个扫描对象。去控制台上扫描输入的内容
		
		System.out.println("请输入您的体重（整数）：");
		
		int w = sc.nextInt();//在控制台上输出一个int类型的值。输入体重
		
		System.out.println("请输入您的身高(小数)：");
		
		double h = sc.nextDouble();
		
		/*int weight = 70;
		
		double height = 1.75;*/
		
		double IMB = w/(h*h);
		
		System.out.println("您的体脂率是:"+IMB);
		
		boolean result = (IMB>18.5)&&(IMB<23.7);
		
		String msg = result?"你的体脂率正常":"不在正常范围内";
		
		System.out.println(msg);
		
	}
	
	
}
