package codes;

public class Sample2 extends Sample1{

	Sample2(int a)
	{
		super(a);
	}
	
	int a = 10;
	public void print()
	{
		System.out.println("Print the Sample2");
	}
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("Sample2 A : " + a);
		
		Sample1 sample = new Sample1(a);
		sample.print();
		
		Sample2 sample1 = new Sample2(10);
		sample1.print();
		System.out.println("Sample1 A : " + sample1.a);
	}
}