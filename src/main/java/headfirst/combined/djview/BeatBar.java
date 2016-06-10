package headfirst.combined.djview;
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable { 
    JProgressBar progressBar;
	Thread thread;
	int control=0;


	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}
	void setControl(int c){
		control=c;
	}

	public void run() {
		for(;;) {
			if (control==0){
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);

			} catch (Exception e) {};
		}}}



}
