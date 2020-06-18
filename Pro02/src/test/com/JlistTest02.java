package test.com;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * @author ujiuye_guo
 * @version ����ʱ�� :2020��6��16�� ����8:08:00
 */
public class JlistTest02 {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("java�б�����ʾ��");
		
		JPanel jPanel = new JPanel();
	
		jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		jPanel.setLayout(new BorderLayout(0,0));
		
		jFrame.add(jPanel);
		
		JScrollPane jScrollPane = new JScrollPane();
		
		jPanel.add(jScrollPane,BorderLayout.CENTER);
		
		JList list= new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jScrollPane.setViewportView(list);
		String[] listData= new  String[12];
		 for (int i=0;i<listData.length;i++) {
			 
			 listData[i]=  "���ǵڼ���"+i;
			 
		 }
		  list.setListData(listData);
		  jFrame.setBounds(100,100,300,200);
		  jFrame.setVisible(true);
}
}