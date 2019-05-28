import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Student implements ActionListener,ItemListener{
	JFrame f;
	JTextField number,name;
	JRadioButton sex1,sex2;
	JComboBox dept,major;
	List infor;
	JButton addInfor,deleteInfor;
	public static void main(String arg[]){
		(new Student()).display();
	}
	public void display(){
		JPanel p1,p2,p3;
		ButtonGroup cg;
		f=new JFrame("ѧ����Ϣ���봰��");
		f.setSize(480,200);
		f.setLocation(200,140);
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(new GridLayout(1,2));
		infor=new List();
		f.add(infor);
		p1=new JPanel();
		p1.setLayout(new GridLayout(6,1));
		f.add(p1);
		number=new JTextField("ѧ��:");
		name=new JTextField("����:");
		cg=new ButtonGroup();
		sex1=new JRadioButton("��",true);
		sex2=new JRadioButton("Ů",true);
		cg.add(sex1);
		cg.add(sex2);
		dept=new JComboBox();
		dept.addItem("�����ϵ");
		dept.addItem("����ϵ");
		dept.addItemListener(this);
		major=new JComboBox();
		major.addItem("�������ѧ�뼼��");
		major.addItem("��Ϣ��������Ϣϵͳ");
		addInfor=new JButton("����");
		deleteInfor=new JButton("ɾ��");
		addInfor.addActionListener(this);
		deleteInfor.addActionListener(this);
		p1.add(number);
		p1.add(name);
		p2=new JPanel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(sex1);
		p2.add(sex2);
		p1.add(p2);
		p1.add(dept);
		p1.add(major);
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(addInfor);
		p3.add(deleteInfor);
		p1.add(p3);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==addInfor){
			String str;
			str=number.getText()+"  "+name.getText();
			if(sex1.isSelected())
				str=str+"  "+sex1.getText();
			if(sex2.isSelected())
				str=str+"  "+sex2.getText();
			str=str+"  "+dept.getSelectedItem();
			str=str+"  "+major.getSelectedItem();
			infor.add(str);
		}
		if(e.getSource()==deleteInfor){
			if(infor.getSelectedIndex()>=0)
				infor.remove(infor.getSelectedIndex());
		}
	}
	public void itemStateChanged(ItemEvent e){
		if(dept.getSelectedIndex()==0){
			major.removeAllItems();
			major.addItem("�������ѧ�뼼��");
			major.addItem("��Ϣ��������Ϣϵͳ");
		}
		if(dept.getSelectedIndex()==1){
			major.removeAllItems();
			major.addItem("���ʽ���");
			major.addItem("�������");
		}
	}

}
