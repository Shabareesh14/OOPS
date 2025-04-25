package consoleApplication;

class Add
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

class Subtraction extends Add
{
	@Override
	public int add(int a, int b)
	{
		return a-b;
		
	}
}
public class Overriding
{
	public static void main(String[] args) 
	{
		Subtraction override = new Subtraction();
		System.out.println("Subtraction : " + override.add(30, 20));
		
		Add overrides = new Add();
		System.out.println("Addition : " + overrides.add(30, 20));
	}

}