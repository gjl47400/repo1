/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月20日 下午9:29:49
 * 测试浮点类型
 */
public class Test07 {

	public static void main(String[] args) {
		
		float a = 3.14f;
		
		double b = 6.28;
		
		double c = 629e-2;
		System.out.println(c);
		
		//浮点数是不精确的千万不要用于比较
		
		float  a1= 111111111f;
		
		float a2 = a1+1;
		
		if(a1==a2) {
			
			System.out.println("相等");
			
		}else {
			
			System.out.println("不相等");
		}
		
		float b1 = 0.1f;
		
		double b2 = 1/10;
		
		System.out.println(b1==b2);
		
	}
	
}