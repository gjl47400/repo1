package test.com;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ujiuye_guo
 * @version 创建时间 :2020年6月16日 下午10:08:20
 */
public class cordsLayOutTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("cards");
		
		JPanel cards = new JPanel();
		
		cards.setLayout(new CardLayout());
		
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		
		JTextField jTextField = new JTextField(15);
		JTextField jTextField2 = new JTextField(15);
		JTextField jTextField3 = new JTextField(15);
		
		jTextField.setText("用户文本框");
		jTextField2.setText("miam文本");
		jTextField.setText("拉拉文本");
		
		jPanel.add(jTextField);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);
		
		JButton jButton = new JButton("btn1");
		JButton jButton2 = new JButton("btn2");
		JButton jButton3 = new JButton("btn3");

		jPanel1.add(jButton);
		jPanel1.add(jButton2);
		jPanel1.add(jButton3);
		
		cards.add(jPanel,"card1");
		
		cards.add(jPanel1,"card2");
		
		CardLayout layout = (CardLayout) cards.getLayout();
		
		layout.show(cards, "card2");
		
		frame.add(cards);
		
		frame.setBounds(100, 100, 400, 200);
		
		frame.setVisible(true);
		
		
	}

}
