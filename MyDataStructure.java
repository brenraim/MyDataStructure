public class MyDataStructure
{
	private int age;
	private String name;
	private String gender;
	
	public MyDataStructure()
	{
		age = 17;
		name = "Brendan";
		gender = "male";
	}

	public MyDataStructure(int a, String n, String g)
	{
		age = a;
		name = n;
		gender = g;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getString()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
}
