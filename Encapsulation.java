package codes;

public class Encapsulation {
	private String name;
	private int age;
	private String address;
	
	Encapsulation(String name,int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) 
	{
		this.name = name;
	}


	public void setAge(int age) 
	{
		this.age = age;
	} 	

	public void setAddress(String address) 
	{
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Encapsulation encaps = new Encapsulation("Shabareesh", 22, "C.57/1 KTC NAGAR");
		System.out.println(encaps.toString());
	}
}