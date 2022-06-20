package Week1.day2;

public class TwoWheeler {
	public static void main(String args[])
	{
	 TwoData d = new TwoData();
	 System.out.println("No of two wheels:"+d.noOfWheels);
	 System.out.println("No of Mirror:"+d.noOfMirror);
	 System.out.println("No of ChassisNumber:"+d.chassisNumber);
	 System.out.println("IS punctured:"+d.ispunctured);;
	 System.out.println("BikeName:"+d.bikeNamel);
	 System.out.println("Running"+d.runningKM);


}
}

class TwoData
{
	public int noOfWheels =2;
	public short noOfMirror = -32678;
	public long chassisNumber = -987654321;
	public boolean ispunctured = true;
	public String bikeNamel ="HERO HONDA";
	public double runningKM = 2.567;
}