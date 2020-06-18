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
 * @version 创建时间 :2020年6月16日 下午6:50:06
 */
public class JareaTest {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		JPanel jPanel = new JPanel();
		
		JTextArea textArea = new JTextArea("请输入内容",7,30);
		
		textArea.setLineWrap(true);//设置文本的自动换行
		
		textArea.setFont(new Font("宋体", Font.BOLD, 16));
		
		textArea.setBackground(Color.yellow);
		
		JScrollPane JscrollPane = new JScrollPane(textArea);
		
		Dimension preferredSize = textArea.getPreferredSize();//获得文本域的首选大小
		
		JscrollPane.setBounds(110, 90, preferredSize.width, preferredSize.height);
		
		jPanel.add(JscrollPane);
		
		jFrame.add(jPanel);
		
		jFrame.setVisible(true);
		
		jFrame.setBounds(100, 100, 400, 200);
		
		jFrame.setDefaultCloseOperation(3);

	}

}
