package om403;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyWindow extends JFrame {
    JTextField jtf1,jtf2;
    JButton jbtn1;
    
    /// prob 6)
    JButton jbtn2;
    
    JLabel jl1;
    MyWindow() {
        setTitle("Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        jtf1 = new JTextField(50);
        jtf1.setBounds(10, 10, 30, 20);
        jtf2 = new JTextField(50);
        jtf2.setBounds(50, 10, 30, 20);
        jbtn1 = new JButton("¥ı«œ±‚");
        jbtn1.setBounds(90,10,80,20);
        
        /// prob 6)
        jbtn2 = new JButton("ª©±‚");jbtn2.setBounds(90,30,80,20);
        
        jl1 = new JLabel("           ");jl1.setOpaque(true);
        jl1.setBackground(Color.YELLOW);jl1.setBounds(180,10,40,20);
        cp.add(jtf1); cp.add(jtf2);cp.add(jbtn1);cp.add(jl1);
        
        /// prob 6)
        cp.add(jbtn2);
        
        setSize(300,180);
        setVisible(true);
        
        jbtn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Integer a1=Integer.parseInt(jtf1.getText());
        		Integer a2=Integer.parseInt(jtf2.getText());
        		Integer a3=a1+a2; 
        		
        		jl1.setText(a3.toString());
        	}
        });
        
        /// prob 6)
        jbtn2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Integer a1=Integer.parseInt(jtf1.getText());
        		Integer a2=Integer.parseInt(jtf2.getText());
        		Integer a3=a1-a2; 
        		
        		jl1.setText(a3.toString());
        	}
        });

    
    }
}

public class MyTest {
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
	}

}
