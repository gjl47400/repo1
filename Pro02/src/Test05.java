/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 上午10:25:00
 * 测试变量的作用域
 */
public class Test05 {

	/*变量的作用域
	 * 1、成员变量,属于对象，生命周期：对象的创建到结束
	 * 2、静态成员变量，属于类 生命周期：类的加载到结束,整型的初始值是0
	 * 3、局部变量，属于方法或者代码块：生命周期：从变量的声明到方法结束
	 * */
	int a;//成员变量
	static int b;//静态变量
	
	{
		int s =10;
		
	}
	
	public static void main(String[] args) {
		
		int a1 = 18;  //局部变量
		
		System.out.println(a1);
		
	}
	
}
