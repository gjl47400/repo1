package test.com;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��17�� ����2:54:11
 */
public class clickTest {
	static int click;
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton();
		
		JLabel jLabel = new JLabel("");
		
		jButton.setFont(new Font("����", Font.BOLD, 16));
		
		jButton.setText("�����");
		
		jFrame.add(jLabel,new BorderLayout().SOUTH);
		
		jFrame.add(jButton,new BorderLayout().NORTH);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jLabel.setText("�������"+(++click)+"��");
				
			}
		});
		
		jFrame.setSize(100, 100);
		
		jFrame.setVisible(true);
		

	}

}
