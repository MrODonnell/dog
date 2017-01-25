package dog;

public class Dog 
{

	public int age;
	public String breed;
	public String voice;

//This will be a constructor
	public Dog ()
	{
		age = 7;
		breed = "mutt";
		voice = "bark";
	}
	
	public Dog (int a, String b, String v)
	{
		age = a;
		breed = b;
		voice = v;
	}
	
	public void speak()
	{
		System.out.println(voice);
	}
}

