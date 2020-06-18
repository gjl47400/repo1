/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 下午2:37:53
 * 算数运算符
 */
public class Test11 {
public static void main(String[] args) {
	
	//二元运算符,需要两个元素来完成计算
	int a  = 10;
	System.out.println(1+1);
	System.out.println("瑞文" + "放逐之刃");
	System.out.println(3-1);
	System.out.println(3*2);
	System.out.println(7/2);//只能整除，余数忽略掉
	System.out.println("7取模于2="+7%2);//取余
	//一元运算符
	//a++;// ++ 自增
	//a--;// -- 自减
	//++a;//前自增
	
	int b = a++; //后自增在做运算时，先运算再自增,前自增，先自增后运算
	
	a++;
	
	System.out.println(b);
	System.out.println(a);
	
	
	
}
}
