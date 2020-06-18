package test.com;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午6:37:58
 */
public class JtextfieldTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JTextField jTextField1 = new JTextField("普通按钮");
		JTextField jTextField2 = new JTextField("设置字体和长度的按钮");
		JTextField jTextField3 = new JTextField("居中对齐");
		jPanel.add(jTextField1);
		jTextField2.setFont(new Font("楷体", Font.BOLD, 20));//修改字体样式
		
		jPanel.add(jTextField2);
		jTextField3.setHorizontalAlignment(JTextField.CENTER);
		
		jPanel.add(jTextField3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 300, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
	}

}
