package com.nexient.bootcamp.gitdemo;

import javax.swing.JOptionPane;
import javax.swing.JWindow;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GitDemo {

	public GitDemo() {
		int[] array = {1, 4, 2, 2, 0};
		
		JWindow window = new JWindow();
		JOptionPane.showMessageDialog(window, "Sum = " + sumArray(array));	
		goToURL();
	}
	
	public int sumArray(int[] array) {
		int sum = 0;
		
		for (int val : array) {
			sum = sum + val;
		}
		
		return sum;
	}
	
	public int addTwo(int num)
	{
		int sum =0;
		sum = num+2;
		return sum;
	}
	
	public void goToURL()
	{
		String URL = JOptionPane.showInputDialog("Input any URL (you have to put www)");
		if(Desktop.isDesktopSupported())
		{
			Desktop desktop = Desktop.getDesktop();
			try{
			desktop.browse(new URI(URL));
			} catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
			
		}
	}
}
