package Week1.day2;

public class PrintDuplicate {
	public static void main(String arg[])
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int le =arr.length;
		
		for (int j=0;j<le;j++)
		{
			int count=0;
			for (int k=j+1;k<le;k++)
			{
				if (arr[j]==arr[k])
				{
					count =1;
					
				}
			}
			if (count != 0)
			{
			System.out.println("Duplicate Value"+ arr[j]);
			}
		}
	}

}
