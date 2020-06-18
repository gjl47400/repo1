/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月20日 下午7:49:25
 * 变量的分类
 */
public class Test04 {
	int ss;

	/*变量的分类
	 * 1、成员变量,从属于对象
	 * 2、局部变量指的就是在方法或者代码块中的变量,局部变量只能在当前的代码块中使用，
	 * 生命周期即为声明位置，方法执行结束
	 * 3、静态变量从属于类，声明周期便随着类，从类的加载到卸载
	 * */
	static int age; //这是一个成员变量
	{
		
		int b = 20;
		
	}
	
	public static void main(String[] args) {
		
		int a = 10;//这是一个局部变量
		
		//System.out.println(b);
		
	}
}
