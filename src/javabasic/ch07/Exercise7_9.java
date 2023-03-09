package javabasic.ch07;

import java.awt.*;
import java.awt.evet.*;

class Exercise7_9 {
public static void main(String[] args) {
	Frame f = new Frame();
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	});
		
}
}
