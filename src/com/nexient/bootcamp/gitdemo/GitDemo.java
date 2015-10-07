package com.nexient.bootcamp.gitdemo;

import javax.swing.JOptionPane;
import javax.swing.JWindow;

public class GitDemo {

	public GitDemo() {
		int[] array = {1, 4, 2, 2, 0};
		
		JWindow window = new JWindow();
		JOptionPane.showMessageDialog(window, "Sum = " + sumArray(array));	
	}
	
	public int sumArray(int[] array) {
		int sum = 0;
		
		for (int val : array) {
			sum = val;
		}
		
		return sum;
	}
	
	public int addTwo(int num)
	{
		int sum =0;
		sum = num+2;
		return sum;
	}
}
