package list.arraylist.implementation;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Main {

	public static void main (String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		System.out.println(numbers);
	}
}
