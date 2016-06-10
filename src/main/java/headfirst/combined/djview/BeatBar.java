package headfirst.combined.djview;
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable { 
    JProgressBar progressBar;
	Thread thread;
	String control="";


	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}
	void setControl(String c){
		control=c;
	}

	public void run() {
		for(;;) {
			if (control.equals("Anotador")){}
			else{
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);

			} catch (Exception e) {};
		}}}



}
