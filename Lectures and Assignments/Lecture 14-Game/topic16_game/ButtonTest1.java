package topic16_game;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest1 implements ActionListener {

	boolean flag = false;

	ButtonTest1() {
		JFrame f = new JFrame();

		JButton btn = new JButton();
		btn.setBounds(130, 100, 100, 40);

		btn.addActionListener(this);

		f.add(btn);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ButtonTest1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("lkejdlkwjedlkw");
		
	}
}
