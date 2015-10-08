package com.nexient.bootcamp.gitdemo;

import javax.swing.JOptionPane;
import javax.swing.JWindow;

import DemoGraph.SimpleGraph;
import javafx.application.Application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GitDemo {
	
	private SimpleGraph graph = new SimpleGraph();

	public GitDemo() {
		int[] array = {1, 4, 2, 2, 0};
		
		JWindow window = new JWindow();
		JOptionPane.showMessageDialog(window, "Sum = " + sumArray(array));	
		Application.launch(SimpleGraph.class);
		//goToURL();

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

	public char convertToChar(int num)
	{
		char alpha = ' ';
		alpha = (char)num;
		return alpha;
	}
	
	public void findPrimes(int num)
	{
		System.out.print("The Prime Factors of "+num+" are : ");
		 
		int i=2;
		while(num>1)
		  {
		   if(num%i == 0)
		    {
		     System.out.print(i+" ");
		     num=num/i;
		    }
		   else
		    i++;
		  }

	}
}
