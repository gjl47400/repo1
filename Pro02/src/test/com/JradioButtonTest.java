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
 * @version ����ʱ�� :2020��6��16�� ����7:18:05
 */
public class JradioButtonTest {

	public static void main(String[] args) {
	
		JFrame Jframe = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("�������ĸ�����");
		
		JRadioButton jRadioButton1 = new JRadioButton("��");
		JRadioButton jRadioButton2 = new JRadioButton("��");
		JRadioButton jRadioButton3 = new JRadioButton("��",true);
		JRadioButton jRadioButton4 = new JRadioButton("��");

		jLabel.setFont(new Font("����", Font.BOLD, 16));
		
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
