package test;
import java.awt.Component;
import java.awt.event.*;
import javax.swing.*;

public class MyMenu extends MouseAdapter implements ActionListener{
	JFrame f;
	JMenuBar mb1;
	JMenu mf1,me1;
	JPopupMenu pm1;
	JTextArea jta;
	JScrollPane jsp;
	public void display(){
		f=new JFrame("�˵�");
		f.setSize(240,180);
		f.setLocation(400,200);
		f.setLayout(null);
		jta=new JTextArea();
		jsp=new JScrollPane();
		jsp.setBounds(0,0,240,180);
		f.add(jsp);
		jta.addMouseListener(this);
		addpopupMenu();
		addmyMenu();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public void addpopupMenu(){
		pm1=new JPopupMenu("Popup");
		pm1.add(new JMenuItem("����"));
		pm1.add(new JMenuItem("ճ��"));
		jta.add(pm1);
	}
	public void addmyMenu(){
		mb1=new JMenuBar();
		f.setJMenuBar(mb1);
		mf1=new JMenu("�ļ�");
		me1=new JMenu("�༭");
		mb1.add(mf1);
		mb1.add(me1);
		mf1.add(new JMenuItem("��"));
		mf1.add(new JMenuItem("����"));
		mf1.addSeparator();
		JMenuItem itemExit=new JMenuItem("�˳�");
		mf1.add(new JMenuItem("����"));
		mf1.add(new JMenuItem("����"));
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand()=="�˳�")
			System.exit(0);
		
	}
	public void moseReleased(MouseEvent mer){
		if(mer.isPopupTrigger())
			pm1.show((Component)mer.getSource(),mer.getX(),mer.getY());
	}
	public static void main(String[] args){
		(new MyMenu()).display();
	}
}
