//Two distances are added
public class Distance {

	private int feet;
	private float inches;
	
	
	
	
	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		
		this.feet = feet;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		if(inches>=12)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		this.inches = inches;
	}

	
	Distance add(Distance distance1,Distance distance2)
	{
		Distance sum= new Distance();
		
		float inches=distance1.getInches()+distance2.getInches();
		int feet=distance1.getFeet()+distance2.getFeet();
		if(inches>12)
		{
			inches=inches%12;
			feet=feet+1;
		}
		else if(inches==12)
		{
			inches=0;
			feet=feet+1;
		}
		sum.feet=feet;
		sum.inches=inches;
		
		return sum;
		
		
	}
		
}
