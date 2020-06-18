/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 上午11:26:29
 * 浮点类型测试
 */
public class Test07 {

	
	public static void main(String[] args) {
		
		//float f = 3.14;  浮点类型在定义的时候默认是double
		float f = 3.14f;
		
		double b = 6.28;
		double b1 = 6.28e3;
		
		double b2 = 10000000000.0;
		
		double b3 = 1.0;
		
		double b4 = b2+b3;
		
		float f1 = 0.1f;
		double d1 = 1.0/10;
		//浮点类型不精确，会出现精度丢失的问题，千万不要用于比较
		if(f1==d1) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		System.out.println(b4);
		
	}
	
}
