package p1;
import java.awt.*;
import java.awt.event.*;
public class gui_class extends WindowAdapter implements ActionListener{
	Frame f;
	TextField tf1,tf2;
	Button b1;
	gui_class(){
		f = new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("Graphical User Interface");
		f.setLayout(null);
		f.addWindowListener(this);
		
		init();
		add_component();
		register();
	}
	
	public void init() {
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		
		b1 = new Button("Click Here");
	}
	
	public void add_component() {
		tf1.setBounds(170,170,100,30);
		b1.setBounds(170,180,70,50);
		
		tf2.setBounds(270,170,100,30);
		
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
	}
	
	public void register() {
		b1.addActionListener(this);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public void actionPerformed(ActionEvent e) {
		String s = tf1.getText();
		tf2.setText(s);
	}
	
}
