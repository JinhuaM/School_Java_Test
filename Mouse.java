import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mouse extends MouseAdapter implements MouseMotionListener{
	JFrame f;
	JTextField t;
	public void display(){
		f=new JFrame("����¼�");
		f.setSize(280,200);
		f.setLayout(null);
		t=new JTextField(20);
		t.setBounds(20,70,200,20);
		f.add(t);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args){
		(new Mouse()).display();
	}
	public void mousePressed(MouseEvent e){
		t.setText("��갴�£�����Ϊ��"+e.getX()+","+e.getY());
	}
	public void mouseReleased(MouseEvent e){
		t.setText("����ͷţ�����Ϊ��"+e.getX()+","+e.getY());
	}
	public void mouseMoved(MouseEvent e){
		t.setText("����ƶ�������Ϊ��"+e.getX()+","+e.getY());
	}
	public void mouseDragged(MouseEvent e){}
}
