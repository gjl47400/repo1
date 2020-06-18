/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月20日 下午7:21:53
 * 变量的本质和声明的格式
 */

public class Test03 {

/*	变量的本质： 
 * 变量的本质就是一个可操作的存储空间，这个空间的位置是确定的，但是大小是不确定的。
 * 
 * java是一门强类型的语言，每个变量都必须声明其数据类型，变量的数据类型决定了变量
 * 占存储空间的大小
 * 例如：int类型是4个字节、double类型是8个字节
 * java中的变量作为最基本的存储单元 	它的要素包括1、变量名2、数据类型3、作用域
 * 1、变量名
 * 2、变量的类型
 * 3、变量的初始化
 * 
 * */
	public static void main(String[] args) {
		int a,b ; //在一行可以声明多个变量
		int c = 10;//可以在变量声明时将其赋值
		//System.out.println(age);变量必须在声明时才可以使用
		//System.out.println(a); 局部变量在初始化后才能使用
		int age1 ;
		int age2= 18;
		//System.out.println(age1+age2);
		
	}
}
