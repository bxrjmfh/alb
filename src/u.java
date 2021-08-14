public class u
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
	//dog[] dogs=dog[8];
}

class dog
{
	private int length;
	private int weight;
	private String name;
	
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
		}
		else if (getWeight() < 5)
		{
			System.out.println("ying!");
		}
		else if (getWeight() > 20)
		{
			System.out.println("Woof!");
		}
	}
}