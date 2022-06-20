package Week1.day2;

public class Car {
	public static void main(String args[])
	{
		Mycar c= new Mycar();
		String output;
		output = c.apply_Acclearate();
		System.out.println(output);
		c.switchOnAc(true);
		c.applyBreak();
		c.applyBreak();
	}
	
}

class Mycar
{
	public void applyBreak()
	{
		System.out.println("Break has been applied");
		
	}
	
	public void applyGear()
	{
		System.out.println("Gear has been applied");
	}
	public void switchOnAc(boolean bApp)
	{
		if (bApp)
		{
			System.out.println("AC is turned on"+bApp);
		}
		else
		{
			System.out.println("AC is turned off" + bApp);
		}
	}
	public String apply_Acclearate()
	{
		return "Applied Acclerate";
	}
}