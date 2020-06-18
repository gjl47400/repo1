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
 * @version 创建时间 :2020年6月17日 下午2:54:11
 */
public class clickTest {
	static int click;
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setLayout(new BorderLayout(0,0));
		
		JButton jButton = new JButton();
		
		JLabel jLabel = new JLabel("");
		
		jButton.setFont(new Font("楷体", Font.BOLD, 16));
		
		jButton.setText("点击我");
		
		jFrame.add(jLabel,new BorderLayout().SOUTH);
		
		jFrame.add(jButton,new BorderLayout().NORTH);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jLabel.setText("被点击了"+(++click)+"次");
				
			}
		});
		
		jFrame.setSize(100, 100);
		
		jFrame.setVisible(true);
		

	}

}
