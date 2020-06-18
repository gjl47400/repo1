package test.com;

import java.awt.Checkbox;
import java.awt.Font;

import javax.swing.*;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午7:44:49
 */
public class checkboxTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("流行的编程语言有");
		
		jLabel.setFont(new Font("楷体", Font.BOLD, 16));
		
		
		
		jFrame.setBounds(100, 100, 400, 200);
		
		JCheckBox checkbox1 = new JCheckBox("JAVA");
		JCheckBox checkbox2 = new JCheckBox("C++");
		JCheckBox checkbox3 = new JCheckBox("PYTHON");
		JCheckBox checkbox4 = new JCheckBox("PHP");
		JCheckBox checkbox5 = new JCheckBox("C");
		
		/*ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(checkbox1);
		buttonGroup.add(checkbox2);
		buttonGroup.add(checkbox3);
		buttonGroup.add(checkbox4);
		buttonGroup.add(checkbox5);*/
		jPanel.add(jLabel);
		jPanel.add(checkbox1);
		jPanel.add(checkbox2);
		jPanel.add(checkbox3);
		jPanel.add(checkbox4);
		jPanel.add(checkbox5);
		
		
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		
		

	}

}
