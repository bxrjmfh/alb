import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;


public class Main
{
	static StreamTokenizer s;
	public static void main(String[] args) throws IOException
	{
		int Boat_num;
		ArrayList<boat> boats = new ArrayList<boat>();
		//Scanner s = new Scanner(System.in);
		//scanner is too slow for m to use
		
		s = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		{
			Boat_num = getInt();
			for (int i = 0; i < Boat_num; i++)
			{
				boat temp = new boat();
				temp.setTime(getInt());//set the time
				temp.setNum_people(getInt());//set the people num
				temp.setpeople(temp.getNum_people());
				for (int j = 0; j < temp.getNum_people(); j++)
				{
					temp.setp(j, getInt());
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
	private static int getInt() throws IOException
	{
		s.nextToken();
		
		return (int) s.nval;
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