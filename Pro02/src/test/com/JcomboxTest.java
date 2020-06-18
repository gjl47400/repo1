package test.com;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午7:55:09
 */
public class JcomboxTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("证件类型");
		
		JComboBox jComboBox = new JComboBox<>();
		
		jComboBox.addItem("身份证");
		jComboBox.addItem("军官证");
		jComboBox.addItem("残疾证");
		jComboBox.addItem("驾驶证");
		
		jPanel.add(jLabel);
		
		jPanel.add(jComboBox);
		
		jFrame.add(jPanel);
		
		jFrame.setBounds(100, 100, 300, 100);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		

	}

}
