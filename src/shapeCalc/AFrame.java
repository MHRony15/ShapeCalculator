package shapeCalc;

import javax.swing.*;

public abstract class AFrame extends JFrame {
	 public AFrame(String title) {
	        // Always call the superclass's constructor:
	        super(title);

	        addWindowListener(new java.awt.event.WindowAdapter() {
	            public void windowClosing(java.awt.event.WindowEvent e) {
	                System.out.println(e);  // For illustration purpose only.
	                System.exit(0);
	            }
	        });

	        initialize();
	    }

	    protected abstract void initialize();
	}


