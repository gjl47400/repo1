package test.com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����8:00:23
 */
public class JListTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JLabel jLabel = new JLabel("֤������");
		
		String[] items = new String[] {"���֤","����֤","��ʻ֤"};
		
		JList jList = new JList<>(items);
		
		jPanel.add(jLabel);
		
		jPanel.add(jList);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(3);
		
		

	}

}
