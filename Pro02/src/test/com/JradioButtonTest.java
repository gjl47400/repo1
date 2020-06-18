package test.com;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午7:18:05
 */
public class JradioButtonTest {

	public static void main(String[] args) {
	
		JFrame Jframe = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("现在是哪个季节");
		
		JRadioButton jRadioButton1 = new JRadioButton("春");
		JRadioButton jRadioButton2 = new JRadioButton("夏");
		JRadioButton jRadioButton3 = new JRadioButton("秋",true);
		JRadioButton jRadioButton4 = new JRadioButton("冬");

		jLabel.setFont(new Font("宋体", Font.BOLD, 16));
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		buttonGroup.add(jRadioButton3);
		buttonGroup.add(jRadioButton4);
		
		jPanel.add(jLabel);
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
		jPanel.add(jRadioButton3);
		jPanel.add(jRadioButton4);
		
		Jframe.add(jPanel);
		Jframe.setBounds(100, 100, 400, 100);
		Jframe.setVisible(true);
		Jframe.setDefaultCloseOperation(3);
	}

}
