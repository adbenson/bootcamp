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
	public static void diamondPatternBasedOnNum(int num){
		for (int i = 0; i < num; i++) 
	          System.out.println("    *********".substring(i, num + 2*i));

	    for (int i =num; i>0;i--)
	        System.out.println("     **********".substring(i-1,num+(2*i)-3));
	   }
	public static int randInt(int min, int max) {
	    
	    int randomNum = min + (int)(Math.random() * ((max - min) + 1));

	    return randomNum;
	}
	public static void fibonacci (int number)
    {
        long a = 0;
        long b = 1;
        for(int i = 1; i<number;i++){
            long c = a +b;
            a=b;
            b=c;
            System.out.println(c);}
    }
		 
}
