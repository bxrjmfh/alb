public class u
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		dog frt =new dog(23,"ui",78);
		dog[] dogs;
		dogs = new dog[3];
		dogs[0]= new dog(28,"io",4);
		dogs[1]= new dog(28,"io",13);
		dogs[2]= new dog(28,"io",6);
		
		
		frt.bark();
		dogs[0].bark();
		dogs[1].bark();
		dogs[2].bark();
	}
	
}

class dog
{
	private int length;
	private int weight;
	private String name;
	
	public dog(int length ,String name ,int weight)
	{
		setLength(length);
		setWeight(weight);
		setName(name);
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	void bark()
	{
		if (getWeight() >= 5 && getWeight() <= 20)
		{
			System.out.println("yip!");
		} else if (getWeight() < 5)
		{
			System.out.println("ying!");
		} else if (getWeight() > 20)
		{
			System.out.println("Woof!");
		}
	}
}