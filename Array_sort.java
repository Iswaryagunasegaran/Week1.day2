package Week1.day2;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,7,6,8};
		int i;
		Arrays.sort(a);
		for (i =0;i<a.length;i++)
		{
			System.out.println("Array values" + a[i]);
		}
		for (i=0;i<a.length;i++)
		{
			if (a[i] != i)
			{
				System.out.println("VAlues in sequence"+a[i]);
				break;
			}
		}
		

	}

}
