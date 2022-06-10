package Test1;


public class DemoFourWheller {
	
	public static void main(String[] args) {
		FourWheller c1=new FourWheller("Audi A8",2000,5,3000000);
		c1.display();
		c1.VehicleException();
		c1.UnsafetyException();
		FourWheller c2=new FourWheller("Range Rover",1900,4,2500000);
		c2.display();
		c2.VehicleException();
		c2.UnsafetyException();
		FourWheller c3=new FourWheller("Rolls-Royal Phantom",3000,6,5000000);
		c3.display();
		c3.VehicleException();
		c3.UnsafetyException();
		FourWheller c4=new FourWheller("Jaguar",100,4,1500000);
		c4.display();
		c4.VehicleException();
		c4.UnsafetyException();

	}

}