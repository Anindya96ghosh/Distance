//Addition of distance in feet and inches
import java.util.*;
public class DistanceTest {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		Distance distance1=new Distance();
		Distance distance2=new Distance();
		Distance distance3=new Distance();
		
		
		System.out.println("Enter the value in feet for distance 1");
		distance1.setFeet(scanner.nextInt());
		

		System.out.println("Enter the value in Inches for distance 1");
		distance1.setInches(scanner.nextFloat());
		
		
		System.out.println("Enter the value in feet for distance 2");
		distance2.setFeet(scanner.nextInt());
		

		System.out.println("Enter the value in Inches for distance 2");
		distance2.setInches(scanner.nextFloat());
	
		
		distance3=distance3.add(distance1,distance2);
		
		System.out.println("The addition of two distances is "+distance3.getFeet()+ " feet "+distance3.getInches()+" inches");
		
	
	}
}
