package shapeCalc;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;

public abstract class AFrame extends JFrame {

    public AFrame(String title) {
        super(title);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println(e);  // For illustration purpose only.
                System.exit(0);
            }
        });
    }

       
    protected abstract  void initialize();
}

