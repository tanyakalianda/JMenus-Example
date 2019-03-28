import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class myFrame extends JFrame
{
	public myFrame()
	{
		JLabel label = new JLabel();
		add(label);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu menu1 = new JMenu("Options 1-3");
		JMenuItem option1 = new JMenuItem("Option 1");
		menu1.add(option1);
		JMenuItem option2 = new JMenuItem("Option 2");
		menu1.add(option2);
		JMenuItem option3 = new JMenuItem("Option 3");
		menu1.add(option3);
		menubar.add(menu1);
		
		JMenu menu2 = new JMenu("Options 4-7");
		JMenuItem option4 = new JMenuItem("Option 4");
		menu2.add(option4);
		menubar.add(menu2);
		
		JMenu menuRemainingOptions = new JMenu("Options 5-7");
		JMenuItem option5 = new JMenuItem("Option 5");
		JMenuItem option6 = new JMenuItem("Option 6");
		JMenuItem option7 = new JMenuItem("Option 7");
		menuRemainingOptions.add(option5);
		menuRemainingOptions.add(option6);
		menuRemainingOptions.add(option7);
		menu2.add(menuRemainingOptions);
		
		JMenuItem option8 = new JMenuItem("Option 8");
		menubar.add(option8);
		
		this.setJMenuBar(menubar);
		
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		option1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		
		option7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());
			}
			
		});
		option8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(((JMenuItem) (e.getSource())).getText());    //adds code to JLabel we created -> shows up on screen
			}
			
		});
		
	}
	
	public static void main(String[] args)
	{
		new myFrame();
	}
}
