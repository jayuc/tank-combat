package com.github.jayu.tank_combat;

import javax.swing.JApplet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
//				createAndShowFrame();
//				createWindowAndShow();
//				createAppletAndShow();
				createDialogAndShow();
			}
		});
        
    }
    
    public static void createAndShowFrame() {
    	JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("标题");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    
    public static void createWindowAndShow() {
    	JWindow win = new JWindow();
    	win.setSize(400, 300);
    	win.setVisible(true);
    }
    
    public static void createDialogAndShow() {
    	JDialog dialog = new JDialog();
    	dialog.setSize(400, 300);
    	dialog.setVisible(true);
    }
    
    public static void createAppletAndShow() {
    	JApplet app = new JApplet();
    	app.setSize(400, 300);
    	app.setVisible(true);
    }
}
