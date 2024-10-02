package i_event;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JTemp {


	JFrame f = null;
	JButton b1 = null;
	JButton b2 = null;
	JButton b3 = null;
	JButton b4 = null;
	JButton b5= null;
	JButton b6= null;
	JButton b7 = null;
	JButton b8 = null;
	JButton b9 = null;
	JButton b10 = null;
	JButton b11 = null;
	JButton b12 = null;
	JButton b13 = null;
	JButton b14 = null;
	JButton b15 = null;

	JLabel la;
	JTextField tf;

	JTemp() {
		f = new JFrame ("유치원...");

		b1 =new JButton("1");
		b2 =new JButton("2");
		b3 =new JButton("3");
		b4 =new JButton("4");
		b5 =new JButton("5");
		b6 =new JButton("6");
		b7 =new JButton("7");
		b8 =new JButton("8");
		b9 =new JButton("9");
		b10 =new JButton("+");
		b11 =new JButton("0");
		b12 =new JButton("=");
		b13 =new JButton("-");
		b14 =new JButton("*");
		b15= new JButton("/");

		la = new JLabel ("");
		tf = new JTextField(50);
		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);
//		f.add(b4);
//		f.add(b5);
//		f.add(b6);
//		f.add(b7);
//		f.add(b8);
//		f.add(b9);
//		f.add(b10);
//		f.add(b11);
//		f.add(b12);
//		f.add(b13);
//		f.add(b14);
//		f.add(b15);
//		f.add(tf);
		
		
		
		JPanel p_north = new JPanel();	
		p_north.add(tf);
		
				
		JPanel p_center = new JPanel();
		
		p_center.setLayout(new GridLayout(5,3));
		p_center.add(b1);
		p_center.add(b2);
		p_center.add(b3);
		p_center.add(b4);
		p_center.add(b5);
		p_center.add(b6);
		p_center.add(b7);
		p_center.add(b8);
		p_center.add(b9);
		p_center.add(b10);
		p_center.add(b11);
		p_center.add(b12);
		p_center.add(b13);
		p_center.add(b14);
		p_center.add(b15);
		
		
		f.setLayout(new BorderLayout());
		f.add(p_center,BorderLayout.CENTER);
		f.add(p_north,BorderLayout.NORTH);
								

		// 화면 출력사이즈
		f.setBounds(100,100,600,400);
		f.setVisible(true);	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



	public static void main(String[] args) {

		JTemp t = new JTemp ();

	}
}
