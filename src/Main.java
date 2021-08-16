import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int Boat_num;
		ArrayList<boat> boats = new ArrayList<boat>();
		Scanner s = new Scanner(System.in);
		if (s.hasNextInt())
		{
			Boat_num = s.nextInt();
			for (int i = 0; i < Boat_num; i++)
			{
				boat temp = new boat();
				temp.setTime(s.nextInt());//set the time
				temp.setNum_people(s.nextInt());//set the people num
				temp.setpeople(temp.getNum_people());
				for (int j = 0; j < temp.getNum_people(); j++)
				{
					temp.setp(j, s.nextInt());
				}
				boats.add(temp);
				
				//judge whether to delete a num
				while (boats.get(boats.size() - 1).getTime() - boats.get(0).getTime() > 86400)
				{
					//if so then time out delete the first boat
					boats.remove(0);
				}
				
				ArrayList<Integer> recorder = new ArrayList<Integer>();
				int counter = 0;
				for (boat boat : boats)
				{
					for (int l = 0; l < boat.getNum_people(); l++)
					{
						if (recorder.contains(boat.getpeople(l)))
						{
							//continue;
						}
						else
						{
							recorder.add(boat.getpeople(l));
							counter++;
						}
					}//each person
				}//each boat
				System.out.println(counter);
			}
		}
	}
}

class boat
{
	private int time;
	private int num_people;
	private int[] people;
	
	public int getNum_people()
	{
		return num_people;
	}
	
	public int getTime()
	{
		return time;
	}
	
	public int getpeople(int place)
	{
		return people[place];
	}
	
	public void setpeople(int num_people)
	{
		this.people = new int[num_people];
	}
	
	public void setNum_people(int num_people)
	{
		this.num_people = num_people;
	}
	
	public void setTime(int time)
	{
		this.time = time;
	}
	
	public void setp(int place, int country)
	{
		this.people[place] = country;
	}
}