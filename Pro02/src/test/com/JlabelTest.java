package test.com;

import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����9:59:42
 */
public class JlabelTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("��ͨ��ǩ");
		
		JLabel jLabel2 = new JLabel();
		
		jLabel2.setText("SHEZHI");
		
		
		ImageIcon imageIcon = new ImageIcon("d:\\money.jpg");
		
		JLabel jLabel3 = new JLabel("��ʼ���",imageIcon,JLabel.CENTER);
		
		jPanel.add(jLabel);
		jPanel.add(jLabel2);
		jPanel.add(jLabel3);
	
		frame.add(jPanel);
		
		frame.setSize(300, 300);
		
		frame.setVisible(true);
		
		

	}

}
