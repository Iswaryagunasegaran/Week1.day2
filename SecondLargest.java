package Week1.day2;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] arg)
	{
		int ar[] = {120,150,11,100,90};
		int c;
		Arrays.sort(ar);
		c= ar.length;
		System.out.print("Second Largest"+ ar[c-2]);
	}
}
