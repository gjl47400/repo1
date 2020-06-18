package test.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����6:50:06
 */
public class JareaTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JTextArea textArea = new JTextArea("����������",7,30);
		
		textArea.setLineWrap(true);//�����ı����Զ�����
		
		textArea.setFont(new Font("����", Font.BOLD, 16));
		
		textArea.setBackground(Color.yellow);
		
		JScrollPane JscrollPane = new JScrollPane(textArea);
		
		Dimension preferredSize = textArea.getPreferredSize();//����ı������ѡ��С
		
		JscrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		jPanel.add(JscrollPane);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setBounds(100, 100, 400, 200);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
