package test.com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午8:00:23
 */
public class JListTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("证件类型");
		
		String[] items = new String[] {"身份证","军官证","驾驶证"};
		
		JList jList = new JList<>(items);
		
		jPanel.add(jLabel);
		
		jPanel.add(jList);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		

	}

}
