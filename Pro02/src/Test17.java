/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 下午3:59:34
 * 短路与、短路或
 */
public class Test17 {

	public static void main(String[] args) {
		
		
		System.out.println(false&&true);
		
		System.out.println(true&&true);
		
		System.out.println(false||true);
		
		//短路与、或  跟 逻辑与、或的区别
		
		int a =1;
		int b = 2;
		
		
		System.out.println(a>b&&a++>0);//逻辑与在判断第一个表达式为false时就判定结果。
		System.out.println();
		System.out.println(a);
	
	}
	
}
