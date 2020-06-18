/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年5月21日 下午3:22:24
 */
public class Test14 {
	public static void main(String[] args) {
		int a = 1;
		short b = 2;
		
		//b = b + a;//3
		b += a;//3,+=有一个自带强转的操作(short)
		System.out.println(b);
}

}
