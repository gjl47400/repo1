package test.com;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����6:37:58
 */
public class JtextfieldTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JTextField jTextField1 = new JTextField("��ͨ��ť");
		JTextField jTextField2 = new JTextField("��������ͳ��ȵİ�ť");
		JTextField jTextField3 = new JTextField("���ж���");
		jPanel.add(jTextField1);
		jTextField2.setFont(new Font("����", Font.BOLD, 20));//�޸�������ʽ
		
		jPanel.add(jTextField2);
		jTextField3.setHorizontalAlignment(JTextField.CENTER);
		
		jPanel.add(jTextField3);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 300, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(3);
		
	}

}
