package om411;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

class MyWindow extends JFrame {
    JTextField jtf1;
    JButton jbtn1;
    
    /// prob 7-1
    JSlider js;
    
	MyWindow() {
        setTitle("Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        jtf1 = new JTextField(50);
        jtf1.setBounds(10, 10, 30, 20);
        jbtn1 = new JButton("¥ı«œ±‚");jbtn1.setBounds(90,10,80,20);
       
        /// prob 7-1
        js = new JSlider(0,100,50);
        js.setBounds(10,30,250,60);
        
        cp.add(jtf1); cp.add(jbtn1);
        
        /// prob 7-1
        cp.add(js);
        
        setSize(300,180);
        setVisible(true);
        
        jbtn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Integer a1=Integer.parseInt(jtf1.getText());
        		
        		/// prob 7-1
        		js.setValue(a1);
        	}
        });
   }
}

public class MyTest {
	public static void main(String[] args) {
		MyWindow mw = new MyWindow();
	}

}
