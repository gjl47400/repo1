package test.com;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����7:55:09
 */
public class JcomboxTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("֤������");
		
		JComboBox jComboBox = new JComboBox<>();
		
		jComboBox.addItem("���֤");
		jComboBox.addItem("����֤");
		jComboBox.addItem("�м�֤");
		jComboBox.addItem("��ʻ֤");
		
		jPanel.add(jLabel);
		
		jPanel.add(jComboBox);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 300, 100);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		

	}

}
