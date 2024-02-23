package org.gof.design.patterns.behavioral.strategy.sorting.subClassing;

import java.util.Arrays;

public class JavaSorter extends QuickSorter {
	
	@Override
	public void sort(double[] array) {
		System.out.println("Using JavaSorter!");
		Arrays.sort(array);
	}
}
