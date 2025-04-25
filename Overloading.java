package consoleApplication;

public class Overloading {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a + b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public void displayAdd()
	{
		System.out.println("ADD : " + add(30,30));
		System.out.println("DOUBLE : " + add(30,50.22));
		System.out.println("ADD : " + add(30,30,40));
	}
	public static void main(String[] args) {
		Overloading polymorphism = new Overloading();
		polymorphism.displayAdd();
	}

}