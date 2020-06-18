/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 下午1:53:33
 * 数据类型之间的转换
 */
public class Test09 {

	public static void main(String[] args) {
		
		//byte向int
		
		byte b1 = 1;
		byte b2 = 2;
		
		int a = b1+b2;//这是一个由小向大转化的过程
		
		//int 向byte类型转换,强转
		
		int a1 = 127;
		
		int a2 = 128;
		
		byte a3 =(byte)(a1+a2);//精度的丢失. -128+127
		
		System.out.println(a);
		
		System.out.println(a3);
		
	}
	
}
