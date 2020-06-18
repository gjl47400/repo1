package test.com;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月17日 上午10:10:44
 */
public class JbutttonTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JButton jButton = new JButton("1111");
		
		Dimension dimension = new Dimension(160,202);
		
		jButton.setPreferredSize(dimension);
		
		jButton.setVerticalAlignment(3);
		
		jPanel.add(jButton);
		
		frame.add(jPanel);
		
		frame.setSize(600, 300);
		
		frame.setVisible(true);
		

	}

}
