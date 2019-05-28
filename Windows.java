import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Windows {
	JFrame f;
	JLabel lab;
	public void display(){
		f=new JFrame("窗口事件");
		f.setSize(240,130);
		f.setLayout(null);
		lab=new JLabel("得到焦点");
		lab.setBounds(50,20,60,20);
		f.add(lab);
		f.addWindowListener(new WinClose());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args){
		(new Windows()).display();
	}
	class WinClose extends WindowAdapter{
		public void windowActivated(WindowEvent e){lab.setText("得到焦点");}
		public void windowDeactivated(WindowEvent e){lab.setText("失去焦点");}
	}
}
